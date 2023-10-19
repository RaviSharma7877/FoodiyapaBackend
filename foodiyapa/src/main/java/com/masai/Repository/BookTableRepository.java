package com.masai.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.masai.models.BookTable;

public interface BookTableRepository extends JpaRepository<BookTable, Integer> {

}
