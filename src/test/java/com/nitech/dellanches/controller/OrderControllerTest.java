package com.nitech.dellanches.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;

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
@WebMvcTest(OrderController.class)
class OrderControllerTest {

	@Autowired
	OrderController controller;
	@MockBean
	OrderService service;
	@MockBean
	OrderEntity order;

	@Test
	void testSave() {
		assertEquals(controller.save(any()).getStatusCodeValue(), HttpStatus.OK.value());
	}

	//@Test
	void testFind() {
		//assertEquals(controller.buscar(any()).getStatusCodeValue(), HttpStatus.OK.value());
	}

	@Test
	void testFindAll() {
		assertEquals(controller.findAll().getStatusCodeValue(), HttpStatus.OK.value());
	}

}
