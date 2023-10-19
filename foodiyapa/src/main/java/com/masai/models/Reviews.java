package com.masai.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Reviews {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reviewId;
	private int rating;
	private String review;
	
	@ManyToOne
	private Users user;
	
	@ManyToOne
	private Product product;
	
	@ManyToOne
	private DeliveryPartner deliveryPartner;

	public Reviews() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reviews(int rating, String review, Users user, Product product, DeliveryPartner deliveryPartner) {
		super();
		this.rating = rating;
		this.review = review;
		this.user = user;
		this.product = product;
		this.deliveryPartner = deliveryPartner;
	}

	public int getReviewId() {
		return reviewId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public DeliveryPartner getDeliveryPartner() {
		return deliveryPartner;
	}

	public void setDeliveryPartner(DeliveryPartner deliveryPartner) {
		this.deliveryPartner = deliveryPartner;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
	
	
}
