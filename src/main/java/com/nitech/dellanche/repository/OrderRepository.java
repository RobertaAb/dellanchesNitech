package com.nitech.dellanche.repository;

import com.nitech.dellanche.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nitech.dellanche.domain.Product;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
