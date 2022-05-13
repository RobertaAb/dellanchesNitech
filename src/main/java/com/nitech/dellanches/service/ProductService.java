package com.nitech.dellanches.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nitech.dellanches.entity.ProductEntity;
import com.nitech.dellanches.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository repository;

	public ProductEntity save(ProductEntity product) {
		return repository.save(product);
	}

	public ProductEntity findById(Integer id) {
		return repository.findProductEntityById(id);
	}

	public List<ProductEntity> findAll() {
		return repository.findAll();
	}
}
