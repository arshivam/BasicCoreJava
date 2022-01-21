package com.basiccorejava;
import java.util.*;

public class LeapYear {
	public static void main(String[] args) {
		System.out.println("WELCOME TO LEAP YEAR USE CASE");
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("Enter year");
		year = sc.nextInt();
		if (year>999 && year<10000) {
			if (year % 4 ==0 && year % 100 ==0 && year % 400 ==0) {
				System.out.println("SPECIFIED YEAR IS LEAP YEAR");
			}
			else {
				System.out.println("SPECIFIED YEAR IS NOT A LEAP YEAR");
			}
		}
		else {
			System.out.println("INVALID YEAR");
		}
	}
}
