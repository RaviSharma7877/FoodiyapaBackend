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
import com.masai.Service.DeliveryPartnerService;
import com.masai.models.DeliveryPartner;

@RestController
public class DeliveryPartnerController {

	private DeliveryPartnerService dpS;

	public DeliveryPartnerController(DeliveryPartnerService dpS) {
		super();
		this.dpS = dpS;
	}
	
	@PostMapping("/deliveryPartner")
	public ResponseEntity<DeliveryPartner> addDeliveryPartner(@RequestBody DeliveryPartner deliveryPartner) {
		return new ResponseEntity<DeliveryPartner>(dpS.addDeliveryPartner(deliveryPartner),HttpStatus.CREATED);
	}
	
	@GetMapping("/deliveryPartner")
	public ResponseEntity<List<DeliveryPartner>> getAllDeliveryPartners() {
		return new ResponseEntity<List<DeliveryPartner>>(dpS.getAllDeliveryPartners(),HttpStatus.OK);
	}
	
	@PostMapping("/deliveryPartner/{id}")
	public ResponseEntity<DeliveryPartner>  updateDeliveryPartnervehicleType(@PathVariable int id, @RequestParam String vehicleType) throws FoodiyapaException {
		return new ResponseEntity<DeliveryPartner>(dpS.updateDeliveryPartnervehicleType(id,vehicleType),HttpStatus.OK);
	}
	
	@DeleteMapping("/deliveryPartner/{id}")
	public ResponseEntity<String> deleteDeliveryPartner(@PathVariable int id) throws FoodiyapaException {
		return new ResponseEntity<String>(dpS.deleteDeliveryPartner(id),HttpStatus.OK);
	}
}
