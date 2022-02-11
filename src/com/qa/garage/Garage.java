package com.qa.garage;

import java.util.ArrayList;
import java.util.List;

import com.qa.vehicle.Vehicle;
import com.qa.vehicle.*;

public class Garage {

	private List<Vehicle> garage;
	private int id = 0;

	public Garage() {		
		garage = new ArrayList<>();
		Vehicle c1 = new Car(id++, "Vauxhall", "Astra", "BN69AYK", "Hatchback");
		Vehicle c2 = new Car(id++, "BMW", "5 Series", "YB12JBV", "Saloon");
		Vehicle c3 = new Car(id++, "Saab", "9-3", "MK11VMP", "Saloon");

		Vehicle b1 = new Motorcycle(id++, "Honda", "", "", "");
		Vehicle b2 = new Motorcycle(id++, "Yamaha", "", "", "");
		Vehicle b3 = new Motorcycle(id++, "BMW", "", "", "");

		Vehicle t1 = new Truck(id++, "", "", "", 0);
		Vehicle t2 = new Truck(id++, "", "", "", 0);
		Vehicle t3 = new Truck(id++, "", "", "", 0);

		addVehicle(c1);
		addVehicle(c2);
		addVehicle(c3);

		addVehicle(b1);
		addVehicle(b2);
		addVehicle(b3);

		addVehicle(t1);
		addVehicle(t2);
		addVehicle(t3);
	}

	public void addVehicle(Vehicle v) {
		garage.add(v);
	}
	
	public void emptyGarage() {
		garage.clear();
		id = 0;
	}

	public void calculateBill() {
		for (Vehicle v : garage) {
			if (v instanceof Car) {
				v.setBill(1000);
			}
			if (v instanceof Motorcycle) {
				v.setBill(500);	
			}
			if (v instanceof Truck) {
				v.setBill(1500);
			}
		}
	}
	
	
	
	public void removeCars() {
		for (Vehicle v : garage) {
			if (v instanceof Car) {
				garage.remove(v);
			}
		}
	}
	
	public void removeTrucks() {
		for (Vehicle v : garage) {
			if (v instanceof Truck) {
				garage.remove(v);
			}
		}
	}
	
	public void removeMotorcycles() {
		for (Vehicle v : garage) {
			if (v instanceof Motorcycle) {
				garage.remove(v);
			}
		}
	}
	
	public void removeVehicle(int id) {
		for (Vehicle v : garage) {
			if (v.getId() == id) {
				garage.remove(v);
				break;
			}
		}
	}
}
