package com.basiccorejava;
import java.util.*;

public class HarmonicNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num :");
		int n = sc.nextInt();
		double result = 0;
		for (double i = 1;i<n;i++) {
			double reciprocal = 1 / i;
			result = result + reciprocal;
		}
		System.out.println("Result : "+result);
	}
}
