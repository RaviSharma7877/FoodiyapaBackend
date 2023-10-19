package com.masai.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;

@Entity
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	@NotNull(message = "Name should not be null")
    private String name;
    private String address;
    private String customerphone;
    @NotNull(message = "Email should not null")
    @Email(message = "Email should be in correct format")
    private String email;
    
    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;

	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customer(@NotNull(message = "Name should not be null") String name, String address, String customerphone,
			@NotNull(message = "Email should not null") @Email(message = "Email should be in correct format") String email,
			List<Orders> orders) {
		super();
		this.name = name;
		this.address = address;
		this.customerphone = customerphone;
		this.email = email;
		this.orders = orders;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCustomerphone() {
		return customerphone;
	}

	public void setCustomerphone(String customerphone) {
		this.customerphone = customerphone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
    
    
}
