package com.masai.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.masai.Exception.FoodiyapaException;
import com.masai.Repository.CategoryRepository;
import com.masai.models.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	private CategoryRepository catRepo;

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		return catRepo.save(category);
	}

	@Override
	public List<Category> getAllCategory() {
		// TODO Auto-generated method stub
		return catRepo.findAll();
	}

	@Override
	public Category updateCategory(int id, String name) throws FoodiyapaException {
		Category cat = catRepo.findById(id).orElseThrow(()-> new FoodiyapaException("category not found"));
		
		cat.setCategories(name);
		return cat;
	}

	@Override
	public String deleteCategory(int id) throws FoodiyapaException {
		Category cat = catRepo.findById(id).orElseThrow(()-> new FoodiyapaException("category not found"));
		
		catRepo.delete(cat);
		return "category deleted successfully";
	}

}
