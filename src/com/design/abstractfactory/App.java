package com.design.abstractfactory;

public class App {

	private Car car;

	public void createCar(CarFactory factory, String fuelType) {
		this.car = factory.getCar(fuelType);
	}

	public static void main(String args[]) {

		App app = new App();

		System.out.println("Creating BMW car with Petrol fuel");
		app.createCar(new BMWFactory(), "PETROL");
		System.out.println(app.getCar().getDetails());

		System.out.println("Creating AUDI car with Diesel fuel");
		app.createCar(new AudiFactory(), "DIESEL");
		System.out.println(app.getCar().getDetails());

	}

	/**
	 * @return the car
	 */
	public Car getCar() {
		return car;
	}

	/**
	 * @param car
	 *            the car to set
	 */
	public void setCar(Car car) {
		this.car = car;
	}

}
