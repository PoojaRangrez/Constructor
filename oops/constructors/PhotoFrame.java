package com.xworkz.oops;

public class PhotoFrame {
	String color;
	String brand;
	int price;
	String mountingType;
	double size;
	int weight;
	
	PhotoFrame(String color,String brand,int price,String mountingType,double size){
		System.out.println("Constructor Invoked");
		this.color=color;
		this.brand=brand;
		this.price=price;
		this.mountingType=mountingType;
        this.size=size;
		
	}
	
	public void gift() {
		System.out.println(this.brand+"Can give it as gift");
	}
	public void picture() {
		System.out.println(this.brand+"Makes collection of pictures");
	}
	public void happy() {
		System.out.println(this.brand+"Makes feel happy to see photos in a frame");
	}

}
