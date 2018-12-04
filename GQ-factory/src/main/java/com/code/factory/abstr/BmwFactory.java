package com.code.factory.abstr;


import com.code.factory.Bmw;
import com.code.factory.Car;

public class BmwFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
