package com.chainsys.day2;
import java.util.Scanner;

public class Hospital3{
                              
	public static void main(String[] args) {
		System.out.println();
		 Hospital hosp=new Hospital();
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter hospital name");
		String hospitalName=sc.next();
		System.out.println("enter place");
		String place=sc.next();
		System.out.println("enter hospital beds");
		int beds=sc.nextInt();
		System.out.println("enter phoneNumber");
		long phoneNumber=sc.nextLong();
		System.out.println("enter mailId");
		
		String emailId=sc.next();
		System.out.println("hospitalName");
		System.out.println("place");
		System.out.println("beds");
		
		System.out.println("phoneNumber");
		System.out.print("emailId");
	}
}

