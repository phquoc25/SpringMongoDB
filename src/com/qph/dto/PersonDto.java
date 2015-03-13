package com.qph.dto;

public class PersonDto {
	private String firstName;
	private String lastName;
	private String vehicleLicencePlate;
	
	public PersonDto() {
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getVehicleLicencePlate() {
		return vehicleLicencePlate;
	}

	public void setVehicleLicencePlate(String vehicleLicencePlate) {
		this.vehicleLicencePlate = vehicleLicencePlate;
	}
	
}
