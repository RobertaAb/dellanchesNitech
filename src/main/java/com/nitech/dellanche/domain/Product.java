package com.nitech.dellanche.domain;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) // gera código automaticamente
	private Integer productId;

	@Column(nullable = false)
	private double price;

	@Column(nullable = false)
	private String name;

	@Column(nullable = true)
	private String description;

	@ManyToMany(mappedBy = "products")
	private List<Order> orders = new ArrayList<Order>();

}
