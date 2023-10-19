package com.masai.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.masai.Exception.FoodiyapaException;
import com.masai.Repository.DeliveryPartnerRepository;
import com.masai.models.DeliveryPartner;

@Service
public class DeliveryPartnerServiceImpl implements DeliveryPartnerService {

	private DeliveryPartnerRepository dpRepo;
	
	
	public DeliveryPartnerServiceImpl(DeliveryPartnerRepository dpRepo) {
		super();
		this.dpRepo = dpRepo;
	}

	@Override
	public DeliveryPartner addDeliveryPartner(DeliveryPartner customer) {
		// TODO Auto-generated method stub
		return dpRepo.save(customer);
	}

	@Override
	public List<DeliveryPartner> getAllDeliveryPartners() {
		// TODO Auto-generated method stub
		return dpRepo.findAll();
	}

	@Override
	public DeliveryPartner updateDeliveryPartnervehicleType(int id, String vehicleType) throws FoodiyapaException {
		DeliveryPartner c = dpRepo.findById(id).orElseThrow(() -> new FoodiyapaException("No DeliveryPartner found for id "+ id));
		c.setVehicleType(vehicleType);
		return c;
	}

	@Override
	public String deleteDeliveryPartner(int id) throws FoodiyapaException {
		DeliveryPartner c = dpRepo.findById(id).orElseThrow(() -> new FoodiyapaException("No DeliveryPartner found for id "+ id));
		dpRepo.delete(c);
		return "Customer deleted successfully";
	}

}
