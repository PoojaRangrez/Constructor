package com.xworkz.oops;

public class BusType {

	public static void main(String[] args) {
		Bus routemasterDoubleDecker=new Bus();
		routemasterDoubleDecker.color="Red";
		routemasterDoubleDecker.engine="AEC V590 9.6 L";
		routemasterDoubleDecker.numOfSeats=57;
		System.out.println(routemasterDoubleDecker.color);
		System.out.println(routemasterDoubleDecker.engine);
		System.out.println(routemasterDoubleDecker.numOfSeats);
		routemasterDoubleDecker.transport();
		
		Bus transitBus=new Bus();
		transitBus.type="City Bus";
		transitBus.platform="Low-ride platform";
		transitBus.numOfSeats=20;
		System.out.println(transitBus.type);
		System.out.println(transitBus.platform);
		System.out.println(transitBus.numOfSeats);
		transitBus.capacity();



		
		
	}

}
