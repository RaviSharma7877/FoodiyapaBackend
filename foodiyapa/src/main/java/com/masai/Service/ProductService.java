package com.masai.Service;

import java.util.List;

import com.masai.Exception.FoodiyapaException;
import com.masai.models.Product;

public interface ProductService {

	public Product addProduct(Product product);
	public List<Product> getAllProduct();
	public List<Product> getAllProductsByRestaurantId(int restaurantId);
	public Product updateProductImg(int id, String img) throws FoodiyapaException;
	public Product updateProductPrice(int id, double price) throws FoodiyapaException;
	public Product updateProductDiscount(int id, double discount) throws FoodiyapaException;
	public Product updateProductStatus(int id, boolean status) throws FoodiyapaException;
	public String deleteProduct(int id) throws FoodiyapaException;
}
