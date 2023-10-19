package com.masai.models;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;
	private String img;
	private String productName;
	private double price;
	private double discount;
	private boolean status;
	
	
	@JsonIgnore
	@ManyToOne(cascade = CascadeType.PERSIST)
	private Orders orders;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	private List<Reviews> productReviews;
	
	@JsonIgnore
	@OneToMany(mappedBy = "product")
	private List<Category> categories;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Product(String img, String productName, double price, double discount,boolean status,
			 Orders orders, List<Reviews> productReviews, List<Category> categories) {
		super();
		this.img = img;
		this.productName = productName;
		this.price = price;
		this.status = status;
		this.discount = discount;
		this.orders = orders;
		this.productReviews = productReviews;
		this.categories = categories;
	}



	public int getProductId() {
		return productId;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}



	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public List<Reviews> getProductReviews() {
		return productReviews;
	}

	public void setProductReviews(List<Reviews> productReviews) {
		this.productReviews = productReviews;
	}



	public List<Category> getCategories() {
		return categories;
	}



	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public boolean getStatus() {
		return status;
	}



	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
	
}