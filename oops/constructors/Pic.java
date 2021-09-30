package com.xworkz.oops;

public class Pic {

	public static void main(String[] args) {
		PhotoFrame frame=new PhotoFrame("Black","Personalized World Frame",600,"Wall Mount",123.5);
		System.out.println(frame.color);
		System.out.println(frame.brand);
		System.out.println(frame.price);
		System.out.println(frame.size);
		
		frame.gift();
		frame.picture();
		frame.happy();


		

		

	}

}
