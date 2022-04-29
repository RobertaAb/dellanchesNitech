package com.nitech.dellanches.controllerTests;


import com.nitech.controller.ProductController;

import com.nitech.domain.Product;
import com.nitech.dto.ProductInsertDto;
import com.nitech.dto.ProductListDto;
import com.nitech.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.mockito.Mockito.when;

import java.math.BigDecimal;
import java.util.Collections;
import java.util.List;

@ExtendWith(MockitoExtension.class)
public class ProductControllerTest {

    @InjectMocks
    ProductController productController;

    @Mock
    ProductService mockedProductService;

    private final Product productMock = new Product();
    private final ProductInsertDto productInsertDtoMock = new ProductInsertDto();
    private final ProductListDto productListDtoMock = new ProductListDto();



    @BeforeEach
    void init(){

    productInsertDtoMock.setName("dasd");
    productInsertDtoMock.setDescription("sdadsaasd");
    productInsertDtoMock.setPrice(BigDecimal.valueOf(0.25));

    productListDtoMock.setId(1);
    productListDtoMock.setDescription("sdaffasd");
    productListDtoMock.setPrice(BigDecimal.valueOf(0.25));
    productListDtoMock.setName("dsadasf");

    productMock.setProductId(1);
    productMock.setName("sfddasdfa");
    productMock.setPrice(123.03);
    productMock.setDescription("dasafg");
    productMock.setOrders(List.of());
}

@Test
    public void ProductRegister(){
        when(mockedProductService.insertProduct(productInsertDtoMock))
                .thenReturn(productInsertDtoMock);

        final ResponseEntity<?> result = productController.insertProduct((productInsertDtoMock));

        Assertions.assertEquals(HttpStatus.CREATED, result.getStatusCode());
        Assertions.assertEquals(productInsertDtoMock, result.getBody());
}

@Test
    public void ReturnProductList() {
    when(mockedProductService.findProduct())
            .thenReturn(Collections.singletonList(productListDtoMock));

    final ResponseEntity<?> result = productController.productList();

    Assertions.assertEquals(HttpStatus.OK, result.getStatusCode());
    Assertions.assertEquals(Collections.singletonList(productListDtoMock), result.getBody());
}


@Test
    public void ReturnByID(){
    when(mockedProductService.findById(productMock.getProductId()))
            .thenReturn(productMock);

    final ResponseEntity<?> result = productController.recoverProduct(1);

    Assertions.assertEquals(HttpStatus.OK, result.getStatusCode());
    Assertions.assertEquals(productMock, result.getBody());
    }





}
