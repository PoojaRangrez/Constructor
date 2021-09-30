package com.xworkz.oops;

public class PerfumeTester {

	public static void main(String[] args) {
		Perfume perfume=new Perfume("WottaGirl",135,199);
		System.out.println(perfume.brand);
		System.out.println(perfume.size);
		System.out.println(perfume.price);
		perfume.open();

	}

}
