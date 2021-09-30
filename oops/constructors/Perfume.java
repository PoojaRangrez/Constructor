package com.xworkz.oops;

public class Perfume {
	String brand;
	int size;
	int price;
	
	Perfume(String brand,int size,int price){
		System.out.println("Perfume Constructor Invoked");
		this.brand=brand;
		this.size=size;
		this.price=price;
	}
	
	public void open() {
	    System.out.println(this.brand +"Opened");
	}
	public void close() {
		System.out.println(this.brand + "Closed");
	}

}
