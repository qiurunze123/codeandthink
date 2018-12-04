package com.code.factory.methodfunc;

import com.code.factory.Audi;
import com.code.factory.Car;

public class AudiFactory implements Factory {

	@Override
	public Car getCar() {
		return new Audi();
	}

}
