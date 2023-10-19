package com.masai.Service;

import java.util.List;

import com.masai.Exception.FoodiyapaException;
import com.masai.models.Orders;

public interface OrderService {

	public Orders addOrder(Orders customer);
	public List<Orders> getAllOrders();
	public Orders updateOrdersItem(int orderId, Orders product) throws FoodiyapaException;
	public String deleteOrders(int iorderIdd) throws FoodiyapaException;
}
