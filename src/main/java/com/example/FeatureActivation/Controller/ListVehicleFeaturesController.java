package com.example.FeatureActivation.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import com.example.FeatureActivation.Service.Impl.ListVehicleFeaturesServiceImpl;
import com.example.FeatureActivation.model.ValidVehicleResponse;

@RestController
public class ListVehicleFeaturesController {

	@Autowired
	private ListVehicleFeaturesServiceImpl listVehicleFeaturesService;

	@RequestMapping("/api/list-enabled-features/{VIN}")
	public ResponseEntity<Object> listEnabledFeatures(@PathVariable String VIN) {
		RestTemplate restTemplate = new RestTemplate();
		String fooResourceUrl = "http://localhost:9101/api/v1/isValidVehicle/" + VIN;
		ResponseEntity<ValidVehicleResponse> response = restTemplate.getForEntity(fooResourceUrl,
				ValidVehicleResponse.class);
		ValidVehicleResponse validVehicle = response.getBody();
		boolean valid = validVehicle.getValid();

		if (valid) {
			return ResponseEntity.ok().body(listVehicleFeaturesService.getVehicleEnabledFeatures(VIN));
		} else {
			// Return error -> Invalid Vehicle
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid Vehicle");
		}
	}
}
