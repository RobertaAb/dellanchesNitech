package com.nitech.dellanches.entity;

import javax.persistence.*;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@Data
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Integer id;

	@Column
	double price;

	@Column
	String name;

	@Column
	String description;
	@ManyToMany(mappedBy = "products")
	private List<OrderEntity> orders = new ArrayList<OrderEntity>();
}
