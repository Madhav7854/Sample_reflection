package com.ra.test;

public class Toy {

	public void play() {
		System.out.println("playing....");
	}

	public String play(String mode) {
		return "playing...." + mode;
	}

	public String play(String play, int value) {
		return "playing...." + play + "..." + value;
	}
}
