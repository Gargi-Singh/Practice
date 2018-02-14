package com.lnt.HelloMaven;

public class Car implements Vehicle{

	private String car_name;
	public String getCar_name() {
		return car_name;
	}
	public void setCar_name(String car_name) {
		this.car_name = car_name;
	}
	public void drive()
	{
		System.out.println("I am driving a car");
	}
	@Override
	public String toString() {
		return "Car [car_name=" + car_name + "]";
	}

}
