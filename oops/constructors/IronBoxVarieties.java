package com.xworkz.oops;

public class IronBoxVarieties {

	public static void main(String[] args) {
		IronBox philips=new IronBox();
		philips.color="Peach";
		philips.price=699;
		philips.weight=540;
		System.out.println(philips.color);
		System.out.println(philips.price);
		System.out.println(philips.weight);
		philips.ironing();
		
		IronBox bajaj=new IronBox();
		bajaj.model="Bajaj";
		bajaj.dimension=27*11*13;
		bajaj.wattage=1000;
		System.out.println(bajaj.model);
		System.out.println(bajaj.dimension);
		System.out.println(bajaj.wattage);
		bajaj.press();
		
		
		

	}

}
