package com.nitech.controller;


import com.nitech.dto.OrderInsertDto;
import com.nitech.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value="/api")
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/order")
    public ResponseEntity<?> insertOrder(@RequestBody OrderInsertDto orderInsertDto)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.orderService.insertOrder(orderInsertDto));
    }

    @GetMapping("/order/{id}")
    public ResponseEntity<?> order(@PathVariable(value="id") int id) {
        return ResponseEntity.ok(this.orderService.findById(id));
    }

    @GetMapping("/order")
    public ResponseEntity<?> order() {
        return ResponseEntity.ok(this.orderService.findAll());
    }
}
