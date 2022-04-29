package com.nitech.controller;


import com.nitech.dto.ProductInsertDto;
import com.nitech.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value="/api")
public class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping("/product") // cadastrar um produto
    public ResponseEntity<?> insertProduct(@RequestBody ProductInsertDto productInsertDto)
    {
        return ResponseEntity.status(HttpStatus.CREATED).body(this.productService.insertProduct(productInsertDto));
    }

    @GetMapping("/product")
    public ResponseEntity<?> productList(){

        return ResponseEntity.ok(this.productService.findProduct());

    }

//    @GetMapping("/product") // criar a lista de produtos
//    public List<Product> productList(){
//       return productService.findProduct();  }



      @GetMapping("/product/{id}")
        public ResponseEntity<?> recoverProduct(@PathVariable(value="id") int id){
        return ResponseEntity.ok(this.productService.findById(id));
      }
//    @GetMapping("/product/{id}")
//    public Product product(@PathVariable(value="id") int id) {
//        return this.productService.findById(id);
//    }
}