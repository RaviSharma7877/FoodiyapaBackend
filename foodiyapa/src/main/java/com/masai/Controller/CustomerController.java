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
import com.masai.Service.CustomerService;
import com.masai.models.Customer;

@RestController
public class CustomerController {


	private CustomerService cusS;

	public CustomerController(CustomerService cusS) {
		super();
		this.cusS = cusS;
	}
	
	@PostMapping("/customer")
	public ResponseEntity<Customer> addCustomer(@RequestBody Customer customer) {
		return new ResponseEntity<Customer>(cusS.addCustomer(customer),HttpStatus.CREATED);
	}
	
	@GetMapping("/customer")
	public ResponseEntity<List<Customer>> getAllCustomers() {
		return new ResponseEntity<List<Customer>>(cusS.getAllCustomers(),HttpStatus.OK);
	}
	
	@PostMapping("/customer/{id}")
	public ResponseEntity<Customer> updateCustomerEmail(@PathVariable int id, @RequestParam String email) throws FoodiyapaException {
		return new ResponseEntity<Customer>(cusS.updateCustomerEmail(id,email),HttpStatus.OK);
	}
	
	@DeleteMapping("/customer/{id}")
	public ResponseEntity<String> deleteCustomer(@PathVariable int id) throws FoodiyapaException {
		return new ResponseEntity<String>(cusS.deleteCustomer(id),HttpStatus.OK);
	}
	
	
}
