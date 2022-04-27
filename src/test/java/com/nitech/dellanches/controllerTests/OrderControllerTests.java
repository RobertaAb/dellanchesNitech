package com.nitech.dellanches.controllerTests;


import com.nitech.dellanche.controller.OrderController;
import com.nitech.dellanche.domain.Order;
import com.nitech.dellanche.dto.OrderInsertDto;
import com.nitech.dellanche.service.OrderService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.Instant;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class OrderControllerTests {

    @InjectMocks
    OrderController orderController;

    @Mock
    OrderService orderServiceMock;

    private final OrderInsertDto orderInsertDtoMock = new OrderInsertDto();
    private final Order orderMock = new Order();


    @BeforeEach
    void init(){
        orderInsertDtoMock.setProductId(List.of());

        orderMock.setDtOrder(Date.from(Instant.now()));
        orderMock.setOrderId(1);
        orderMock.setTotal(100.00);
        orderMock.setProducts(List.of());
    }

    @Test
    public void OrderRegister(){
        when(orderServiceMock.insertOrder(orderInsertDtoMock))
                .thenReturn(orderMock);

        final ResponseEntity<?> result = orderController.insertOrder((orderInsertDtoMock));

        Assertions.assertEquals(HttpStatus.CREATED, result.getStatusCode());
        Assertions.assertEquals(orderMock, result.getBody());
}

    @Test
    public void GetOrderByID(){
        when(orderServiceMock.findById(orderMock.getOrderId()))
                .thenReturn(orderMock);

        final ResponseEntity<?> result = orderController.order(1);

        Assertions.assertEquals(HttpStatus.OK, result.getStatusCode());
        Assertions.assertEquals(orderMock, result.getBody());

    }

    @Test
    public void OrderList(){
    when(orderServiceMock.findAll())
            .thenReturn(Collections.singletonList(orderMock));

    final ResponseEntity<?> result = orderController.order();

        Assertions.assertEquals(HttpStatus.OK, result.getStatusCode());
        Assertions.assertEquals(Collections.singletonList(orderMock), result.getBody());

    }

}
