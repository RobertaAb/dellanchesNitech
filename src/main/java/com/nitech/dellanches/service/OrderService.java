package com.nitech.dellanches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitech.dellanches.entity.OrderEntity;
import com.nitech.dellanches.repository.OrderRepository;
import com.nitech.dellanches.repository.ProductRepository;

@Service
public class OrderService {
	@Autowired
	OrderRepository orderRepository;

	@Autowired
	ProductRepository productRepository;

	public OrderEntity save(OrderEntity order) {

		for (int i = 0; i < order.getProducts().size(); i++) {
			order.setTotal(order.getTotal()
					+ productRepository.findProductEntityById(order.getProducts().get(i).getId()).getPrice());
		}

		return orderRepository.save(order);
	}

	public OrderEntity findById(Integer id) {
		return orderRepository.findOrderEntityById(id);
	}

	public List<OrderEntity> findAll() {
		return orderRepository.findAll();
	}

}
