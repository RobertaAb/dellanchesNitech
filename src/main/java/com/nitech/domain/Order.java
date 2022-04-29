package com.nitech.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="ORDERS")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer orderId;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    @Temporal(TemporalType.DATE)
    @Column(nullable=false)
    private Date dtOrder;

    @Column(nullable=false)
    private double total;

    @JsonIgnore
    @ManyToMany
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinTable(
            name = "ORDER_PRODUCT",
            joinColumns = @JoinColumn(
                    name = "order_id", referencedColumnName = "orderId"),
            inverseJoinColumns= @JoinColumn(name = "product_id", referencedColumnName = "productId"))
    private List<Product> products = new ArrayList<Product>();
}
