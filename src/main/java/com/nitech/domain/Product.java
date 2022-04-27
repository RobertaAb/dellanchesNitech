package com.nitech.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Setter
@Getter
@Entity
@Table(name="PRODUCT")
public class Product {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    int productCode;

    @Column(nullable=false)
    int price;

    @Column(nullable=false)
    String name;

    String description;


}
