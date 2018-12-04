package com.code.proxy.cglib;

public class TestGglibProxy {
	public static void main(String[] args) {
		try {
			GQSingle gqSingle = (GQSingle)new GKMeipo().getInstance(new GQSingle());
			gqSingle.findLove();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
