package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Exception.FoodiyapaException;
import com.masai.Repository.CustomerRepository;
import com.masai.models.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository cRepo;
	
	
	public CustomerServiceImpl(CustomerRepository cRepo) {
		super();
		this.cRepo = cRepo;
	}

	@Override
	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return cRepo.save(customer);
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return cRepo.findAll();
	}

	@Override
	public Customer updateCustomerEmail(int id, String email) throws FoodiyapaException {
		Customer c = cRepo.findById(id).orElseThrow(() -> new FoodiyapaException("No product found for id "+ id));
		c.setEmail(email);
		return c;
	}

	@Override
	public String deleteCustomer(int id) throws FoodiyapaException {
		Customer c = cRepo.findById(id).orElseThrow(() -> new FoodiyapaException("No product found for id "+ id));
		cRepo.delete(c);
		return "Customer deleted successfully";
	}

}
