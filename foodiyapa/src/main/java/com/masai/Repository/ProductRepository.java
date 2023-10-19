package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

//	List<Product> findByRestaurantId(int restaurantId);

}
