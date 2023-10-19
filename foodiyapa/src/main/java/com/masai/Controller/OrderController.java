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
import com.masai.Service.OrderService;
import com.masai.models.Orders;

@RestController
public class OrderController {

	private OrderService oS;

	public OrderController(OrderService oS) {
		super();
		this.oS = oS;
	}
	
	@PostMapping("/order")
	public ResponseEntity<Orders> addOrder(@RequestBody Orders order) {
		return new ResponseEntity<Orders>(oS.addOrder(order),HttpStatus.CREATED);
	}
	
	@GetMapping("/order")
	public ResponseEntity<List<Orders>> getAllOrders() {
		return new ResponseEntity<List<Orders>>(oS.getAllOrders(),HttpStatus.OK);
	}
	
	@PostMapping("/order/{id}")
	public ResponseEntity<Orders> updateOrdersItem(@PathVariable int id, @RequestParam Orders order) throws FoodiyapaException {
		return new ResponseEntity<Orders>(oS.updateOrdersItem(id,order),HttpStatus.OK);
	}
	
	@DeleteMapping("/order/{id}")
	public ResponseEntity<String> deleteOrders(@PathVariable int id) throws FoodiyapaException {
		return new ResponseEntity<String>(oS.deleteOrders(id),HttpStatus.OK);
	}
}
