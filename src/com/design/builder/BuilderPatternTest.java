package com.design.builder;

public class BuilderPatternTest {

	public static void main(String[] args) {
		Car car = new Car.Builder().carName("porsche").musicSystem("Bose").build();
		System.out.println(car);
		System.out.println(-10 % -3);
	}
}
