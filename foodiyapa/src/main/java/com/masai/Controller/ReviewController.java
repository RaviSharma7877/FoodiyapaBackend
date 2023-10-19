package com.masai.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.masai.Exception.FoodiyapaException;
import com.masai.Service.ReviewService;
import com.masai.models.Reviews;

@RestController
public class ReviewController {

	private ReviewService reS;

	public ReviewController(ReviewService reS) {
		super();
		this.reS = reS;
	}
	
	@PostMapping("/reviews")
	public ResponseEntity<Reviews> addReviews(@RequestBody Reviews customer) {
		return new ResponseEntity<Reviews>(reS.addReviews(customer),HttpStatus.CREATED);
	}
	
	@GetMapping("/reviews")
	public ResponseEntity<List<Reviews>> getAllReviews() {
		return new ResponseEntity<List<Reviews>>(reS.getAllReviews(),HttpStatus.OK);
	}
	
	@DeleteMapping("/reviews/{id}")
	public ResponseEntity<String> deleteReviews(@PathVariable int id) throws FoodiyapaException {
		return new ResponseEntity<String>(reS.deleteReviews(id),HttpStatus.OK);
	}
}
