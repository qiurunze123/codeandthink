package com.code.factory.simple;


import com.code.factory.Car;

public class SimpleFactoryTest {

	
	
	public static void main(String[] args) {
	
		Car car = new SimpleFactory().getCar("Audi");
		System.out.println(car.getName());
		
	}
	
}
