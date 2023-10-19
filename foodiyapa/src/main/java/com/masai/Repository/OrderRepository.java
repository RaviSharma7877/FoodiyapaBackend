package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Orders;

public interface OrderRepository extends JpaRepository<Orders, Integer> {

}
