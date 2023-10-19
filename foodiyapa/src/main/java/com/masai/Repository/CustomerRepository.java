package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
