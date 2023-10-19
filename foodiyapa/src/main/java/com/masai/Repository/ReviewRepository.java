package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.Reviews;

public interface ReviewRepository extends JpaRepository<Reviews, Integer> {

}
