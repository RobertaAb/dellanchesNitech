package com.nitech.dellanche.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class OrderDto {

    private List<Integer> productId;

}