package com.xworkz.oops;

public class IDCard {
	String cardHolderName;
	long contactNum;
	long aadharNum;
	String address;
	
	IDCard(String cardHolderName,long contactNum,long aadharNum,String address){
		System.out.println("Constructor Invoked");
		this.cardHolderName=cardHolderName;
		this.contactNum=contactNum;
		this.aadharNum=aadharNum;
		this.address=address;
	}
	public void identity() {
		System.out.println("ID card is a document that is used to prove a person's identity");
	}
	public void info() {
		System.out.println("ID card is used to store information about the person in the form of database");
	}
	
	
	

}
