package com.masai.Service;

import java.util.List;

import com.masai.Exception.FoodiyapaException;
import com.masai.models.Category;
import com.masai.models.Customer;

public interface CategoryService {

	public Category addCategory(Category category);
	public List<Category> getAllCategory();
	public Category updateCategory(int id, String name) throws FoodiyapaException;
	public String deleteCategory(int id) throws FoodiyapaException;
}
