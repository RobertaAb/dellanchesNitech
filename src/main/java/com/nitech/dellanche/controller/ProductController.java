package com.nitech.dellanche.controller;

import com.nitech.dellanche.domain.Product;
import com.nitech.dellanche.dto.ProductDto;
import com.nitech.dellanche.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/product") // cadastrar um produto
    public ResponseEntity<?> insertProduct(@RequestBody ProductDto productDto)
    {
        return ResponseEntity.ok(this.productService.insertProduct(productDto));
    }

    @GetMapping("/product") // criar a lista de produtos
    public List<Product> productList(){
       return productService.findProduct();

      }

    @GetMapping("/product/{id}")
    public Product product(@PathVariable(value="id") int id) {
        return this.productService.findById(id);
    }
}