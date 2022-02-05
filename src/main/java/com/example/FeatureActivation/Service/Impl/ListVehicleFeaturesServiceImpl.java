package com.example.FeatureActivation.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.FeatureActivation.Entity.VehicleFeaturesData;
import com.example.FeatureActivation.Repository.VehicleFeatureDataRepository;

@Service
public class ListVehicleFeaturesServiceImpl {
	
	@Autowired
	private VehicleFeatureDataRepository featureDataRepository;

	public List<VehicleFeaturesData> getVehicleEnabledFeatures(String VIN) {
		List<VehicleFeaturesData> vehicleFeaturesDataList = featureDataRepository.getVehicleFeaturesDatas(VIN, "Y");
		return vehicleFeaturesDataList;
	}
}
