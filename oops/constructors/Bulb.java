package com.xworkz.oops;

public class Bulb {
	String brand;
	String lightType;
	int price;
	int wattage;
	
	Bulb(String brand,int price,String lightType,int wattage){
		System.out.println("Bulb Constructor Invoked");
		this.brand=brand;
		this.price=price;
		this.lightType=lightType;
		this.wattage=wattage;
	}
	
	public void feature() {
		System.out.println(this.brand+"Bulb has Color Changing feature");
	}
	
	public void light() {
		System.out.println(this.brand+"Provide brightest light");
	}
	
	public void speaker() {
		System.out.println("Helps in listening music by good inbuilt speakers");

	}

}
