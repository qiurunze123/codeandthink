package com.code.factory.methodfunc;


import com.code.factory.Bmw;
import com.code.factory.Car;

public class BmwFactory implements Factory {

	@Override
	public Car getCar() {
		return new Bmw();
	}

}
