package com.lnt.HelloMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		System.out.println( "Hello World!" );
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

		Vehicle car = (Vehicle)context.getBean("car");
		Vehicle bike = (Vehicle)context.getBean("bike");
		car.drive();
		bike.drive();
		System.out.println(car);
		System.out.println(bike);
	}
}
