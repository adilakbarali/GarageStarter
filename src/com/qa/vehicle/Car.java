package com.qa.vehicle;

public class Car extends Vehicle {
	
	private String bodyType;

	public Car(int id, String brand, String model, String registration, String bodyType) {
		super(id, brand, model, registration);
		this.bodyType = bodyType;
	}

	public String getBodyType() {
		return bodyType;
	}

	public void setBodyType(String bodyType) {
		this.bodyType = bodyType;
	}

}
