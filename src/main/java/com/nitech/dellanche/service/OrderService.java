package com.nitech.dellanche.service;

import com.nitech.dellanche.domain.Order;
import com.nitech.dellanche.domain.Product;
import com.nitech.dellanche.dto.OrderDto;
import com.nitech.dellanche.dto.ProductDto;
import com.nitech.dellanche.repository.OrderRepository;
import com.nitech.dellanche.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;

    @Autowired
    ProductService productService;

    public Order insertOrder(OrderDto orderDto){
        List<Product> products = new ArrayList<>();
        Order order = new Order();
        order.setDtOrder(new Date());
        orderDto.getProductId().forEach(id -> products.add(this.productService.findById(id)));
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
