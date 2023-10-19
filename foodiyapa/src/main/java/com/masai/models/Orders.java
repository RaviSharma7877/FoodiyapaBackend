package com.masai.models;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
    private Customer customer;
	@ManyToOne(cascade = CascadeType.PERSIST)
    private DeliveryPartner deliveryPartner;
	
	@OneToMany(mappedBy = "orders")
    private List<Product> items;
    private double totalAmount;
    private boolean isDelivered;
    
    

	public Orders() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Orders(Customer customer, DeliveryPartner deliveryPartner, List<Product> items, double totalAmount,
			boolean isDelivered) {
		super();
		this.customer = customer;
		this.deliveryPartner = deliveryPartner;
		this.items = items;
		this.totalAmount = totalAmount;
		this.isDelivered = isDelivered;
	}

	public int getOrderId() {
		return orderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public DeliveryPartner getDeliveryPartner() {
		return deliveryPartner;
	}

	public void setDeliveryPartner(DeliveryPartner deliveryPartner) {
		this.deliveryPartner = deliveryPartner;
	}

	public List<Product> getItems() {
		return items;
	}

	public void setItems(List<Product> items) {
		this.items = items;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public boolean isDelivered() {
		return isDelivered;
	}

	public void setDelivered(boolean isDelivered) {
		this.isDelivered = isDelivered;
	}
    
    
    
}
