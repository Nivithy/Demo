package com.chainsys.day2;

public class Hospitaltest {

	public static void main(String[] args) {
		Hospital hosp1=new Hospital();
		hosp1.address="Chennai";
		hosp1.ambulance=true;
		hosp1.contactNumber=1234567890l;
		hosp1.emailId="nivi@gmail.com";
		hosp1.hospitalId=55555;
		hosp1.hospitalName="Appollo";
		hosp1.sec='g';
		System.out.println(hosp1.address);
		System.out.println(hosp1.ambulance);
		System.out.println(hosp1.contactNumber);
		System.out.println(hosp1.emailId);
		System.out.println(hosp1.hospitalId);
		System.out.println(hosp1.hospitalName);
		System.out.println(hosp1.sec);
	}

}
