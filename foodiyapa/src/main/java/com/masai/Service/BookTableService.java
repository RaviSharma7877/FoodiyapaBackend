package com.masai.Service;

import java.util.List;

import com.masai.Exception.FoodiyapaException;
import com.masai.models.BookTable;
import com.masai.models.Category;
import com.masai.models.Customer;

public interface BookTableService {

	public BookTable addTable(BookTable table);
	public List<BookTable> getAllTable();
	public BookTable updateTable(int id, String name) throws FoodiyapaException;
	public String deleteTable(int id) throws FoodiyapaException;
}
