package com.nitech.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name="ORDER")
public class Order {
// duvida = TOTAL geralmente preenche com a soma, ele seria  AUTO incremento? linha 15.
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private int orderId;

    @Column(nullable=false)
    int productCode;

    @Column(nullable=false)
    int quantity;

    @Column(nullable=false)
    int subtotal;

    @Column(nullable=false)
    int total;
}
