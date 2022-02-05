package com.example.FeatureActivation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FeatureActivation.Entity.VehicleFeaturesData;

@Repository
public interface VehicleFeatureDataRepository extends CrudRepository<VehicleFeaturesData, String>{
	@Query(name = "SELECT * FROM FTR_ACT WHERE VIN = ?1")
	public List<VehicleFeaturesData> findByVIN(String VIN);
}
