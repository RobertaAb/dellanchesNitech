package com.nitech.dellanche.controller;

import com.nitech.dellanche.service.ProductService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;

@ExtendWith(SpringExtension.class) //Pesquisar o que realmente isso faz
@WebMvcTest(ProductController.class)

public class ProductControllerTest {

    @MockBean
    ProductService productService;

    @Autowired
    ProductController productController;

    @Test
    void testInsertProduct() {
        assertEquals(productController.insertProduct(any()).getStatusCodeValue(),HttpStatus.OK.value());
    }

    @Test
    void testProduct(){
        assertNull(productController.product(anyInt()));
    }

    @Test
    void testProductList(){
        assertNotNull(productController.productList());
    }
}