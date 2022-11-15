package com.chainsys.day2;

public class TestBus {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Bus bus1=new Bus();
		 bus1.nonstop=false;
			bus1.busSource="Chennai";
			bus1.busDestination ="Madurai";
		System.out.println(bus1.busDestination);
		System.out.println(bus1.busId);
		System.out.println(bus1.fare);
		Bus bus2=new Bus();
		bus2.noofSeats=100;
		bus2.busSource="tambaram";
		bus2.busDestination="Tanjore";
		System.out.println(bus2.travelsName);
		System.out.println(bus2.busDestination);
				
	}

}
