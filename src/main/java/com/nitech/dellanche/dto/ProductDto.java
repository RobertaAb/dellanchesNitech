package com.nitech.dellanche.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
public class ProductDto {

    private BigDecimal price;

    private String name;

    private String description;
}
