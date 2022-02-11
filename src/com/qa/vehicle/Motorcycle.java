package com.qa.vehicle;

public class Motorcycle extends Vehicle {
	
	private String classType;

	public Motorcycle(int id, String brand, String model, String registration, String classType) {
		super(id, brand, model, registration);
		this.classType = classType;
	}

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}


}
