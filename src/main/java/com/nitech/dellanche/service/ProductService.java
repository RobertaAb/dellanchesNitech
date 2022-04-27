package com.nitech.dellanche.service;

import com.nitech.dellanche.domain.Product;
import com.nitech.dellanche.dto.ProductInsertDto;
import com.nitech.dellanche.dto.ProductListDto;
import com.nitech.dellanche.repository.OrderRepository;
import com.nitech.dellanche.repository.ProductRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;


@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;


    public ProductInsertDto insertProduct(ProductInsertDto productDto) {
        Product product = new ModelMapper().map(productDto, Product.class);
        product = productRepository.save(product);
        return new ModelMapper().map(product, ProductInsertDto.class);
    }

    public Product findById(int id){

        return this.productRepository.findProductById(id);
    }

    public List<ProductListDto> findProduct(){
        return listOfProductDto(productRepository.findAll());
    }

    public List<ProductListDto> listOfProductDto(List<Product> products){
        List<ProductListDto> listDto = new ArrayList<>();
        ModelMapper modelMapper = new ModelMapper();
        for(int i = 0; i < products.size(); i++){
            listDto.add(modelMapper.map(products.get(i), ProductListDto.class));
        }
        return listDto;
    }

}