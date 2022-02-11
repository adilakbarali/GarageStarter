package com.qa.vehicle;

public abstract class Vehicle {
	
	private int id;
	private String brand;
	private String model;
	private String registration;
	private int bill = 0;	
	
	public Vehicle(int id, String brand, String model, String registration) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.registration = registration;
	}

	public int getBill() {
		return bill;
	}

	public void setBill(int bill) {
		this.bill = bill;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getRegistration() {
		return registration;
	}

	public void setRegistration(String registration) {
		this.registration = registration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	
}
