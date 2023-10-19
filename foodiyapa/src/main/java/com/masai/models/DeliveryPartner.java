package com.masai.models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class DeliveryPartner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int partnerId;
    private String name;
    private String vehicleType;
    private String driverMobile;
    
    @OneToMany(mappedBy = "deliveryPartner")
    private List<Orders> orders;

	public DeliveryPartner() {
		super();
		// TODO Auto-generated constructor stub
	}

	public DeliveryPartner(String name, String vehicleType, String driverMobile, List<Orders> orders) {
		super();
		this.name = name;
		this.vehicleType = vehicleType;
		this.driverMobile = driverMobile;
		this.orders = orders;
	}

	public int getPartnerId() {
		return partnerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getDriverMobile() {
		return driverMobile;
	}

	public void setDriverMobile(String driverMobile) {
		this.driverMobile = driverMobile;
	}

	public List<Orders> getOrders() {
		return orders;
	}

	public void setOrders(List<Orders> orders) {
		this.orders = orders;
	}
    
    

}
