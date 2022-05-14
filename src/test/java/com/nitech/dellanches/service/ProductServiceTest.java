package com.nitech.dellanches.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nitech.dellanches.entity.ProductEntity;
import com.nitech.dellanches.repository.ProductRepository;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductService.class)

class ProductServiceTest {
	@Autowired
	ProductService service;
	@MockBean
	ProductRepository repository;
	@MockBean
	ProductEntity product;

	@Test
	void testSave() {
		when(service.save(any())).thenReturn(product);
	}

	@Test
	void testFindById() {
		when(service.findById(any())).thenReturn(product);
	}

	@Test
	void testFindAll() {
		when(service.findAll()).thenReturn(List.of(product));
	}

}
