package com.nitech.dellanches.repository;

import com.nitech.dellanches.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  OrderRepository extends JpaRepository <OrderEntity, Integer>{
    OrderEntity findOrderEntityById(Integer id);
}
