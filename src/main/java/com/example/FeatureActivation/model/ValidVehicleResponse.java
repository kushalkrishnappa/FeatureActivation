package com.example.FeatureActivation.model;

public class ValidVehicleResponse {
	private boolean valid;
	private String vin;

	// Getter Methods

	public boolean getValid() {
		return valid;
	}

	public String getVin() {
		return vin;
	}

	// Setter Methods

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

}
