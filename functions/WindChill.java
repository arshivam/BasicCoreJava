package com.basiccorejava.functions;
import java.util.*;

public class WindChill {
	public static void calculation(double t,double v) {
		double windchill= 35.74 + 0.62158 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("windchill :"+windchill);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter temperature in fahrenheit");
		double t = sc.nextDouble();
		System.out.println("enter wind speed in miles per hour");
		double v = sc.nextDouble();
		if (t>50 || v>120 || v<3) {
			System.out.println("Invalid Inputs");
		}
		else {
		calculation(t,v);
		}
	}
}
