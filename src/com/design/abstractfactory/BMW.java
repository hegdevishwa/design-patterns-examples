package com.design.abstractfactory;

public class BMW implements Car {

	private Engine engine;
	private String name = "BMW";

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String getDetails() {
		return "BMW [engine=" + engine.getDetails() + ", name=" + name + "]";
	}

}
