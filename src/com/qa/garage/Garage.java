package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.vehicle.Vehicle;

public class Garage {
	
	private List<Vehicle> garage;
	
	public Garage() {
		garage = new ArrayList<>();
	}
	
	public void addVehicle(Vehicle v) {
		garage.add(v);
	}
}
