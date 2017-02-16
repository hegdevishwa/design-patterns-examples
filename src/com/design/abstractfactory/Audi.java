package com.design.abstractfactory;

public class Audi implements Car {

	private Engine engine;
	private String name = "AUDI";

	@Override
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	@Override
	public String getDetails() {
		return "Audi [engine=" + engine.getDetails() + ", name=" + name + "]";
	}

}
