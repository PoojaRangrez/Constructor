package com.xworkz.oops;

public class Bag {
	String color;
	int price;
	String brand;
	
	Bag(String color,int price,String brand){
		System.out.println("Bag Constructor Invoked");
		this.color=color;
		this.price=price;
		this.brand=brand;
	}
	
	public void carry() {
		System.out.println(this.brand+"Can carry");
	}
	public void keep() {
		System.out.println("Keep Books");
	}

}
