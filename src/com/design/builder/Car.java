package com.design.builder;

public class Car {

	private String carName;
	private String musicSystem;
	private String tyre;

	private Car(Builder builder) {

		this.carName = builder.carName;
		this.musicSystem = builder.musicSystem;
		this.tyre = builder.tyre;
	}

	public static class Builder {

		private String carName;
		private String musicSystem;
		private String tyre = "MRF";

		public Builder() {
		}

		public Builder carName(String carName) {
			this.carName = carName;
			return this;
		}

		public Builder musicSystem(String musicSystem) {
			this.musicSystem = musicSystem;
			return this;
		}

		public Builder tyre(String tyre) {
			this.tyre = tyre;
			return this;
		}

		public Car build() {
			return new Car(this);
		}
		
		

	}

	@Override
	public String toString() {
		return "Car [carName=" + carName + ", musicSystem=" + musicSystem + ", tyre=" + tyre + "]";
	}

}
