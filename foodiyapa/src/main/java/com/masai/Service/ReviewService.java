package com.masai.Service;

import java.util.List;

import com.masai.Exception.FoodiyapaException;
import com.masai.models.Reviews;

public interface ReviewService {

	public Reviews addReviews(Reviews customer);
	public List<Reviews> getAllReviews();
	public String deleteReviews(int id) throws FoodiyapaException;
}
