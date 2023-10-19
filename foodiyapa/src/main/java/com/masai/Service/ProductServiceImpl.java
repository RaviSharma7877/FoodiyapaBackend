package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Exception.FoodiyapaException;
import com.masai.Repository.ProductRepository;
import com.masai.models.Product;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository pRepo;
	
	
	public ProductServiceImpl(ProductRepository pRepo) {
		super();
		this.pRepo = pRepo;
	}

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return pRepo.save(product);
	}

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return pRepo.findAll();
	}

	@Override
	public Product updateProductImg(int id, String img) throws FoodiyapaException {
		Product c = pRepo.findById(id).orElseThrow(() -> new FoodiyapaException("No product found for id "+ id));
		c.setImg(img);
		return c;
	}
	
	@Override
	public Product updateProductPrice(int id, double price) throws FoodiyapaException {
		Product c = pRepo.findById(id).orElseThrow(() -> new FoodiyapaException("No product found for id "+ id));
		c.setPrice(price);
		return c;
	}
	
	@Override
	public Product updateProductDiscount(int id, double discount) throws FoodiyapaException {
		Product c = pRepo.findById(id).orElseThrow(() -> new FoodiyapaException("No product found for id "+ id));
		c.setDiscount(discount);
		return c;
	}
	
	@Override
	public Product updateProductStatus(int id, boolean status) throws FoodiyapaException {
		Product c = pRepo.findById(id).orElseThrow(() -> new FoodiyapaException("No product found for id "+ id));
		c.setStatus(status);
		return c;
	}

	@Override
	public String deleteProduct(int id) throws FoodiyapaException {
		Product c = pRepo.findById(id).orElseThrow(() -> new FoodiyapaException("No product found for id "+ id));
		pRepo.delete(c);
		return "Customer deleted successfully";
	}

	@Override
    public List<Product> getAllProductsByRestaurantId(int restaurantId) {
        return null;
    }

}
