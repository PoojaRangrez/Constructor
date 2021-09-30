package com.xworkz.oops;

public class Coffee {

	public static void main(String[] args) {
		Mug mugTest=new Mug("Ceramic","Blue Handle Mug",11.8,300,"Picture Ceramic Mug");
		System.out.println(mugTest.material);
		System.out.println(mugTest.style);
		System.out.println(mugTest.size);
		System.out.println(mugTest.capacity);
		System.out.println(mugTest.brand);
		
		mugTest.drink();
		mugTest.capacity();
		mugTest.heat();



	}

}
