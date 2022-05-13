package com.nitech.dellanches.controller;

import com.nitech.dellanches.entity.OrderEntity;
import com.nitech.dellanches.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/order")
@RestController
public class OrderController {

    @Autowired
    OrderService orderservice;
    @PostMapping
    public ResponseEntity< ? > save(@RequestBody OrderEntity orderEntity){
        return ResponseEntity.ok(orderservice.save(orderEntity));
    }
    @GetMapping
    public ResponseEntity < ? > buscar(@RequestParam Integer id){
        return ResponseEntity.ok(orderservice.findById(id));

    }
}
