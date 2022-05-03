package com.nitech.dellanche.controller;

import com.nitech.dellanche.domain.Order;
import com.nitech.dellanche.dto.OrderDto;
import com.nitech.dellanche.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value="/api")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<?> insertOrder(@RequestBody OrderDto orderDto)
    {
        return ResponseEntity.ok(this.orderService.insertOrder(orderDto));
    }

    @GetMapping("/order/{id}")
    public Order order(@PathVariable(value="id") int id) {
        return this.orderService.findById(id);
    }

    @GetMapping("/order")
    public List<Order> order() {
        return this.orderService.findAll();
    }
}
