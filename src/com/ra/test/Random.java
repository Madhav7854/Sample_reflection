package com.ra.test;

public class Random {

	public static Random instance;

	private Random() {
		// no operation
	}

	public synchronized static Random getInstance() {
		if (instance == null) {
			instance = new Random();
		}
		return instance;
	}

}
