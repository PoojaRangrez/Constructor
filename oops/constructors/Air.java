package com.xworkz.oops;

public class Air {

	public static void main(String[] args) {
		Fan orientElectricWendy=new Fan();
		orientElectricWendy.type="Ceiling Fan";
		orientElectricWendy.motorSpeed=320;
		orientElectricWendy.price=2585;
		orientElectricWendy.powerConsumption=70;
		System.out.println(orientElectricWendy.type);
		System.out.println(orientElectricWendy.motorSpeed);
		System.out.println(orientElectricWendy.price);
		System.out.println(orientElectricWendy.powerConsumption);
		orientElectricWendy.swing();
		
		Fan crompton=new Fan();
		crompton.type="Table Fan";
		crompton.powerConsumption=58;
		crompton.price=2199;
		crompton.speed=1330;
		System.out.println(crompton.type);
		System.out.println(crompton.speed);
		System.out.println(crompton.price);
		System.out.println(crompton.powerConsumption);
		crompton.air();
		
		

	}

}
