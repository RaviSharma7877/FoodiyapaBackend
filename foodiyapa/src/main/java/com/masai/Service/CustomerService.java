package com.masai.Service;

import java.util.List;

import com.masai.Exception.FoodiyapaException;
import com.masai.models.Customer;

public interface CustomerService {

	public Customer addCustomer(Customer customer);
	public List<Customer> getAllCustomers();
	public Customer updateCustomerEmail(int id, String email) throws FoodiyapaException;
	public String deleteCustomer(int id) throws FoodiyapaException;
}
