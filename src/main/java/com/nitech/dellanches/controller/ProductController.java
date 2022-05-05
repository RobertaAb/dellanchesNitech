package com.nitech.dellanches.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nitech.dellanches.entity.ProductEntity;
import com.nitech.dellanches.service.ProductService;

@RequestMapping("/api/product")
@RestController
public class ProductController {
	@Autowired
	ProductService service;

	@PostMapping
	public ResponseEntity<?> save(@RequestBody ProductEntity product) {
		return ResponseEntity.ok(service.save(product));

	}

	@GetMapping
	public ProductEntity find(@RequestParam Integer Id) {
		return service.findById(Id);
	}

}
