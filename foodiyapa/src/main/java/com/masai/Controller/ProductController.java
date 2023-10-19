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
import com.masai.Service.ProductService;
import com.masai.models.Product;

@RestController
public class ProductController {

	private ProductService pS;

	public ProductController(ProductService pS) {
		super();
		this.pS = pS;
	}
	
	@PostMapping("/products")
	public ResponseEntity<Product> addProduct(@RequestBody Product customer) {
		return new ResponseEntity<Product>(pS.addProduct(customer),HttpStatus.CREATED);
	}
	
	@GetMapping("/products")
	public ResponseEntity<List<Product>> getAllProduct() {
		return new ResponseEntity<List<Product>>(pS.getAllProduct(),HttpStatus.OK);
	}
	
	@GetMapping("/restaurant/{restaurantId}/products")
    public List<Product> getAllProductsByRestaurantId(@PathVariable int restaurantId) {
        return pS.getAllProductsByRestaurantId(restaurantId);
    }
	
	@PostMapping("/products/{idi}")
	public ResponseEntity<Product> updateProductImg(@PathVariable int idi, @RequestParam String img) throws FoodiyapaException {
		return new ResponseEntity<Product>(pS.updateProductImg(idi,img),HttpStatus.OK);
	}
	
	@PostMapping("/products/{idp}")
	public ResponseEntity<Product> updateProductPrice(@PathVariable int idp, @RequestParam double price) throws FoodiyapaException {
		return new ResponseEntity<Product>(pS.updateProductPrice(idp,price),HttpStatus.OK);
	}
	
	@PostMapping("/products/{idd}")
	public ResponseEntity<Product> updateProductDiscount(@PathVariable int idd, @RequestParam double discount) throws FoodiyapaException {
		return new ResponseEntity<Product>(pS.updateProductDiscount(idd,discount),HttpStatus.OK);
	}
	
	@PostMapping("/products/{id}")
	public ResponseEntity<Product> updateProductStatus(@PathVariable int id, @RequestParam boolean status) throws FoodiyapaException {
		return new ResponseEntity<Product>(pS.updateProductStatus(id,status),HttpStatus.OK);
	}
	
	@DeleteMapping("/products/{id}")
	public ResponseEntity<String> deleteProduct(@PathVariable int id) throws FoodiyapaException {
		return new ResponseEntity<String>(pS.deleteProduct(id),HttpStatus.OK);
	}
}
