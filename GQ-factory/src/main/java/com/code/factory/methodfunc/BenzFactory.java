package com.code.factory.methodfunc;


import com.code.factory.Benz;
import com.code.factory.Car;

public class BenzFactory implements Factory {

	@Override
	public Car getCar() {
		return new Benz();
	}

}
