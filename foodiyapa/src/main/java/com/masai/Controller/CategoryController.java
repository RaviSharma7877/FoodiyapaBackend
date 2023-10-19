package com.masai.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.FoodiyapaException;
import com.masai.Service.CategoryService;
import com.masai.models.Category;

@RestController
public class CategoryController {


	private CategoryService catS;

	public CategoryController(CategoryService catS) {
		super();
		this.catS = catS;
	}
	
	@PostMapping("/category")
	public ResponseEntity<Category> addCategory(@RequestBody Category customer) {
		return new ResponseEntity<Category>(catS.addCategory(customer),HttpStatus.CREATED);
	}
	
	@GetMapping("/category")
	public ResponseEntity<List<Category>> getAllCategory() {
		return new ResponseEntity<List<Category>>(catS.getAllCategory(),HttpStatus.OK);
	}
	
	@PostMapping("/category/{id}")
	public ResponseEntity<Category> updateCategory(@PathVariable int id, @RequestParam String name) throws FoodiyapaException {
		return new ResponseEntity<Category>(catS.updateCategory(id,name),HttpStatus.OK);
	}
	
	@DeleteMapping("/category/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id) throws FoodiyapaException {
		return new ResponseEntity<String>(catS.deleteCategory(id),HttpStatus.OK);
	}
	
	
}
