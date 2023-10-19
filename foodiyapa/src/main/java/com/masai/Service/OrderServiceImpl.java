package com.masai.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.masai.Exception.FoodiyapaException;
import com.masai.Repository.OrderRepository;
import com.masai.models.Orders;

@Service
public class OrderServiceImpl implements OrderService {

	private OrderRepository oRepo;
	
	
	public OrderServiceImpl(OrderRepository oRepo) {
		super();
		this.oRepo = oRepo;
	}

	@Override
	public Orders addOrder(Orders customer) {
		// TODO Auto-generated method stub
		return oRepo.save(customer);
	}

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return oRepo.findAll();
	}

	@Override
	public Orders updateOrdersItem(int orderId, Orders product) throws FoodiyapaException {
		Optional<Orders> existingOrdersOptional = oRepo.findById(orderId);

        if (existingOrdersOptional.isPresent()) {
            Orders existingOrders = existingOrdersOptional.get();
            
            existingOrders.setItems(product.getItems());
            
            Orders updatedOrdersEntity = oRepo.save(existingOrders);

            return updatedOrdersEntity;
        } else {
            // Handle the case where the Orders entity with the given orderId is not found
            throw new FoodiyapaException("Orders with orderId " + orderId + " not found");
        }
	}

	@Override
	public String deleteOrders(int orderId) throws FoodiyapaException {
		Orders c = oRepo.findById(orderId).orElseThrow(() -> new FoodiyapaException("No product found for id "+ orderId));
		oRepo.delete(c);
		return "Customer deleted successfully";
	}

}
