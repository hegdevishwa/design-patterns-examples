package com.design.abstractfactory;

public class AudiFactory implements CarFactory {

	public Car getCar(String fuelType) {

		Car car = new BMW();

		if (fuelType.equalsIgnoreCase("PETROL")) {
			car.setEngine(new PetrolEngine());
		} else if (fuelType.equalsIgnoreCase("DIESEL")) {
			car.setEngine(new DieselEngine());
		}

		return car;
	}
}
