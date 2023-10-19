package com.masai.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Category {

	@Id
	private int categoryId;
	private String categories;
	
	@ManyToOne
	private Product product;

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(String categories, Product product) {
		super();
		this.categories = categories;
		this.product = product;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public String getCategories() {
		return categories;
	}

	public void setCategories(String categories) {
		this.categories = categories;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
