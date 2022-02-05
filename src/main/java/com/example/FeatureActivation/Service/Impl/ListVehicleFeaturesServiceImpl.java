package com.example.FeatureActivation.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.FeatureActivation.Entity.VehicleFeaturesData;
import com.example.FeatureActivation.Repository.VehicleFeatureDataRepository;
import com.example.FeatureActivation.model.ValidVehicleResponse;

@Service
public class ListVehicleFeaturesServiceImpl {
	
	@Autowired
	private VehicleFeatureDataRepository featureDataRepository;

	public List<VehicleFeaturesData> listEnabledFeatures(String VIN) {

		RestTemplate restTemplate = new RestTemplate(); 
		String fooResourceUrl = "http://localhost:9101/api/v1/isValidVehicle/" + VIN; 
		ResponseEntity<ValidVehicleResponse> response = restTemplate.getForEntity(fooResourceUrl, ValidVehicleResponse.class); 
		ValidVehicleResponse validVehicle = response.getBody();
		Boolean valid = validVehicle.getValid();
//		List<VehicleFeaturesData> response = new 
		if(valid) {
			
		}else {
			
		}

	}

}
