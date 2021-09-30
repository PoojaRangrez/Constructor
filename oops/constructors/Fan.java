package com.xworkz.oops;

public class Fan {
	String type;
	int motorSpeed;
	int price;
	int speed;
	int powerConsumption;
	int bladeSweepSize;
	int airFlow;
	String material;
	
	public void swing() {
		System.out.println("Swings from side to side");	
	}
	public void air() {
		System.out.println("Renew the indoor air replacing stale air with fresh air");
	}
	public void cool() {
		System.out.println("Cooling");
	}
	public void temperature() {
		System.out.println("To regulate the interior temperature");
	}

}
