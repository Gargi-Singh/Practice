package com.lnt.Spring_Maven_Anno_Config;

import org.springframework.stereotype.Component;

@Component
public class Tyre {

	String brand;
	int warranty;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getWarranty() {
		return warranty;
	}
	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}
	
	@Override
	public String toString() {
		return "Tyre";
	}
	
}
