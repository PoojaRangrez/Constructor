package com.xworkz.oops;

public class AC {
	int size;
	int price;
	String color;
	String quality;
	String model;
	String brand;
	String compressor;
	String evaporatorCoil;
	String refrigerant;
	
	public void cool() {
		System.out.println("Even cooling");
	}
	public void heat() {
		System.out.println("Removing heat");
	}
	public void humidity() {
		System.out.println("Humidity from the indoor air");
	}
	public void tem() {
		System.out.println("Reducing temperature");
	}
	public void blow() {
		System.out.println("AC blows cold air");
	}

}
