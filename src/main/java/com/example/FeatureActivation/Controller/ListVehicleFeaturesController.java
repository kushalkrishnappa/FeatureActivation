package com.example.FeatureActivation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.FeatureActivation.Service.ListVehicleFeaturesService;

@RestController
public class ListVehicleFeaturesController {
	
	@Autowired
	private ListVehicleFeaturesService listVehicleFeaturesService;
	

//	GET /api/list-enabled-features/<VIN>

	@Request
	public List listEnabledFeatures()
}
