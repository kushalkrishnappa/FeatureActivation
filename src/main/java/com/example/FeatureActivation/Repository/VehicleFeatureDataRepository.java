package com.example.FeatureActivation.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.FeatureActivation.Entity.VehicleFeaturesData;

@Repository
public interface VehicleFeatureDataRepository extends CrudRepository<VehicleFeaturesData, String>{
	@Query(value = "SELECT * FROM FTR_ACT WHERE VIN = ?1 AND ENB_FLG = ?2", nativeQuery = true)
	public List<VehicleFeaturesData> getVehicleFeaturesDatas(String VIN, String flag);
}

