package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Exception.FoodiyapaException;
import com.masai.Repository.ReviewRepository;
import com.masai.models.Reviews;

@Service
public class ReviewServiceImpl implements ReviewService {

	private ReviewRepository rRepo;
	
	
	public ReviewServiceImpl(ReviewRepository rRepo) {
		super();
		this.rRepo = rRepo;
	}

	@Override
	public Reviews addReviews(Reviews customer) {
		// TODO Auto-generated method stub
		return rRepo.save(customer);
	}

	@Override
	public List<Reviews> getAllReviews() {
		// TODO Auto-generated method stub
		return rRepo.findAll();
	}

	@Override
	public String deleteReviews(int id) throws FoodiyapaException {
		Reviews c = rRepo.findById(id).orElseThrow(() -> new FoodiyapaException("No product found for id "+ id));
		rRepo.delete(c);
		return "Customer deleted successfully";
	}

}
