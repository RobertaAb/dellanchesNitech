package com.nitech.dellanche.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;

@Getter
@Setter
public class ProductInsertDto {

    private BigDecimal price;

    private String name;

    private String description;
}
