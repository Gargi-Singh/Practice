package com.lnt.Spring_Maven_Anno_Config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	
	@Autowired
	Tyre tyre;
	
	   public void drive()
		{
			System.out.println("I am driving a car");
		}

	public Tyre getTyre() {
		return tyre;
	}

	public void setTyre(Tyre tyre) {
		this.tyre = tyre;
	}

	@Override
	public String toString() {
		return "Car runs on "+tyre;
	}
	

	   
	}
