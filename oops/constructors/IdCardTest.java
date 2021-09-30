package com.xworkz.oops;

public class IdCardTest {

	public static void main(String[] args) {
		IDCard identity=new IDCard("xyz",9685586569L,675367857L,"12th ward,abc area,mno road,oplo-897 098");
		System.out.println(identity.cardHolderName);
		System.out.println(identity.contactNum);
		System.out.println(identity.aadharNum);
		System.out.println(identity.address);
		
		identity.identity();
		identity.info();

		

	}

}
