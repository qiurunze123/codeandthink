package com.code.factory.abstr;


import com.code.factory.Audi;
import com.code.factory.Car;

public class AudiFactory extends AbstractFactory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
