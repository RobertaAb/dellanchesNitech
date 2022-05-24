package com.nitech.dellanche.controller;

import com.nitech.dellanche.service.OrderService;
import org.hibernate.mapping.Any;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;

@ExtendWith(SpringExtension.class) //Pesquisar o que realmente isso faz
@WebMvcTest(OrderController.class)
class OrderControllerTest {

	@Autowired
	OrderController orderController;

	@MockBean
	OrderService orderService;

	@Test
	void testInsertOrder() {

		assertEquals(
				orderController.insertOrder(any()).
						getStatusCodeValue(),
				HttpStatus.OK.value());

	}

	@Test
	void testOrderInt() {
		fail("Not yet implemented");
	}

	@Test
	void testOrder() {
		fail("Not yet implemented");
	}

}
