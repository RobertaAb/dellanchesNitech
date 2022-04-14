package com.nitech.dellanche.service;

import com.nitech.dellanche.domain.Product;
import com.nitech.dellanche.dto.ProductDto;
import com.nitech.dellanche.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public ProductDto insertProduct(ProductDto productDto) {
        Product product = new ModelMapper().map(productDto, Product.class);
        product = productRepository.save(product);
        return new ModelMapper().map(product, ProductDto.class);
    }

    public Product findById(int id){

        return this.productRepository.findProductById(id);
    }

    public List<Product> findProduct(){
        return this.productRepository.findAll();
    }

}