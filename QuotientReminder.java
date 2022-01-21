package com.basiccorejava;
import java.util.*;

public class QuotientReminder {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Divident & Divisor :");
		double dividend = sc.nextInt();
		double divisor = sc.nextInt();

		double quotient = dividend / divisor;
		double remainder = dividend % divisor;

		System.out.println("The Quotient is = " + quotient);
		System.out.println("The Remainder is = " + remainder);
	}
}
