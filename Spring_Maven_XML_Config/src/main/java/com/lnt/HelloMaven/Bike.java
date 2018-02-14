package com.lnt.HelloMaven;

public class Bike implements Vehicle {

	private String bike_name;
	
	public Bike(String bike_name) {
		super();
		this.bike_name = bike_name;
	}
	public String getBike_name() {
		return bike_name;
	}
	public void setBike_name(String bike_name) {
		this.bike_name = bike_name;
	}
	public void drive()
	{
		System.out.println("I am riding a bike");
	}
	@Override
	public String toString() {
		return "Bike [bike_name=" + bike_name + "]";
	}

}
