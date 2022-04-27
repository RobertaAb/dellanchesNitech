package com.nitech.dellanche.service;

import com.nitech.dellanche.domain.Order;
import com.nitech.dellanche.domain.Product;
import com.nitech.dellanche.dto.OrderInsertDto;
import com.nitech.dellanche.repository.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductService productService;

    public Order insertOrder(OrderInsertDto orderInsertDto){
        List<Product> products = new ArrayList<>();
        Order order = new Order();
        order.setDtOrder(new Date());
        orderInsertDto.getProductId().forEach(id -> products.add(this.productService.findById(id)));
        System.out.println(products.size());
        products.forEach(p -> order.setTotal(order.getTotal() + p.getPrice()));
        order.setProducts(products);
        return this.orderRepository.save(order);
    }

    public Order findById(int id){
        return this.orderRepository.findById(id).get();
    }

    public List<Order> findAll(){
        return this.orderRepository.findAll();
    }

}
