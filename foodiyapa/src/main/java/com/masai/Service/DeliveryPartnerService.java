package com.masai.Service;

import java.util.List;

import com.masai.Exception.FoodiyapaException;
import com.masai.models.DeliveryPartner;

public interface DeliveryPartnerService {

	public DeliveryPartner addDeliveryPartner(DeliveryPartner customer);
	public List<DeliveryPartner> getAllDeliveryPartners();
	public DeliveryPartner updateDeliveryPartnervehicleType(int id, String vehicleType) throws FoodiyapaException;
	public String deleteDeliveryPartner(int id) throws FoodiyapaException;
}
