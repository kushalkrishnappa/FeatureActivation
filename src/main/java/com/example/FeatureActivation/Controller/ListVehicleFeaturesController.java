package com.example.FeatureActivation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FeatureActivation.Entity.VehicleFeaturesData;
import com.example.FeatureActivation.Service.Impl.ListVehicleFeaturesServiceImpl;


@RestController
public class ListVehicleFeaturesController {
	
	@Autowired
	private ListVehicleFeaturesServiceImpl listVehicleFeaturesService;
	
	@RequestMapping("/api/list-enabled-features/{VIN}")
	public List<VehicleFeaturesData> listEnabledFeatures(@PathVariable String VIN) {
		return listVehicleFeaturesService.listEnabledFeatures(VIN);
	}
}
