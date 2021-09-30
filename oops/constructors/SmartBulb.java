package com.xworkz.oops;

public class SmartBulb {

	public static void main(String[] args) {
		Bulb smartbulb=new Bulb("Halonix",500,"LED",12);
		System.out.println(smartbulb.brand);
		System.out.println(smartbulb.price);
		System.out.println(smartbulb.lightType);
		System.out.println(smartbulb.wattage);
		smartbulb.feature();

		
		
		

	}

}
