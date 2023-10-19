package com.masai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.FoodiyapaException;
import com.masai.Repository.BookTableRepository;
import com.masai.models.BookTable;

@Service
public class BookTableServiceImpl implements BookTableService {
	
	@Autowired
	private BookTableRepository tableRepo;

	@Override
	public BookTable addTable(BookTable table) {
		return tableRepo.save(table);
	}

	@Override
	public List<BookTable> getAllTable() {
		return tableRepo.findAll();
	}

	@Override
	public BookTable updateTable(int id, String name) throws FoodiyapaException {
		BookTable table = tableRepo.findById(id).orElseThrow(()-> new FoodiyapaException("table not found by id:- "+id));
		table.setName(name);
		return table;
	}

	@Override
	public String deleteTable(int id) throws FoodiyapaException {
		BookTable table = tableRepo.findById(id).orElseThrow(()-> new FoodiyapaException("table not found by id:- "+id));
		tableRepo.delete(table);
		return "table deleted successfully";
	}

}
