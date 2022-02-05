package com.example.FeatureActivation.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FeatureActivation.Entity.VehicleFeaturesData;

@Repository
public interface VehicleFeatureDataRepository extends CrudRepository<VehicleFeaturesData, String>{

}
