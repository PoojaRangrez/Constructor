package com.xworkz.oops;

public class SchoolBag {

	public static void main(String[] args) {
		Bag school=new Bag("Red",300,"Polestar Bag");
		System.out.println(school.color);
		System.out.println(school.price);
		System.out.println(school.brand);
		school.carry();


	}

}
