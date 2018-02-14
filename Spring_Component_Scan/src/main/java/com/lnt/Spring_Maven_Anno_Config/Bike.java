package com.lnt.Spring_Maven_Anno_Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
	
	
	
	public void drive()
	{
		System.out.println("I am riding a bike");
		//System.out.println("Tyre used by car is "+tyre);
	}

	

	
}

