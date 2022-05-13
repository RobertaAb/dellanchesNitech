package com.nitech.dellanches.service;

import com.nitech.dellanches.entity.OrderEntity;
import com.nitech.dellanches.repository.OrderRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;
    public OrderEntity save(OrderEntity order){
        return orderRepository.save(order);
    }


    public Object findById(Integer id) {
        return orderRepository.findById(id);
    }


	public List<OrderEntity> findAll() {
		return orderRepository.findAll();
	}
}
