package com.nitech.dellanches.controller;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.nitech.dellanches.entity.OrderEntity;
import com.nitech.dellanches.service.OrderService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(OrderController.class) //Classe que sera testada

class OrderControllerTest {
	
	@Autowired
	OrderController ordercontroller; // Solicitando autorizacao para uso
	
	@MockBean
    OrderService orderservice; // Simula o OrderService, ou seja, o OrderService
	
	@MockBean
	OrderEntity orderentity; 
	
	@Test
	void testSave() {
		assertEquals(ordercontroller.save(any()).getStatusCodeValue(), HttpStatus.OK.value());
	}

	@Test
	void testFind() {
		assertEquals(ordercontroller.find(any()).getStatusCodeValue(), HttpStatus.OK.value());
	}

	@Test
	void testFindAll() {
		assertEquals(ordercontroller.findAll().getStatusCodeValue(), HttpStatus.OK.value());
	}

}
