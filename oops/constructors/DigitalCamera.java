package com.xworkz.oops;

public class DigitalCamera {

	public static void main(String[] args) {
		Camera nikon=new Camera();
		nikon.brand="Nikon Digital Camera";
		nikon.price=1500;
		nikon.color="Black";
		System.out.println(nikon.brand);
		System.out.println(nikon.price);
		System.out.println(nikon.color);
		nikon.capture();
		
		Camera YI=new Camera();
		YI.brand="YI Z15 Action Camera";
		YI.color="White";
		YI.pixels=1080;
		System.out.println(YI.brand);
		System.out.println(YI.color);
		System.out.println(YI.pixels);
        YI.record();
		
		
		

	}

}
