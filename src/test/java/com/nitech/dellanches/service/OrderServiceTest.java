package com.nitech.dellanches.service;

import com.nitech.dellanches.entity.OrderEntity;
import com.nitech.dellanches.repository.OrderRepository;
import com.nitech.dellanches.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(SpringExtension.class)
@WebMvcTest(OrderService.class)
public class OrderServiceTest {
    @MockBean
    OrderEntity orderEntity;

    @MockBean
    OrderRepository orderRepository;

    @MockBean
    ProductRepository productRepository;

    @Autowired
    OrderService orderService;

    @Test
    void testFindAll() {
        when(orderService.findAll()).thenReturn(List.of(orderEntity));
    }

}
