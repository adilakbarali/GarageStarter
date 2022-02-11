package com.qa.vehicle;

public class Truck extends Vehicle {

	private int cabSize;

	public Truck(int id, String brand, String model, String registration, int cabSize) {
		super(id, brand, model, registration);
		this.cabSize = cabSize;
	}

	public int getCabSize() {
		return cabSize;
	}

	public void setCabSize(int cabSize) {
		this.cabSize = cabSize;
	}
	
	
	
}
