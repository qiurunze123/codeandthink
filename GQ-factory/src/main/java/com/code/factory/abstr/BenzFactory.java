package com.code.factory.abstr;


import com.code.factory.Benz;
import com.code.factory.Car;

public class BenzFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
