package com.basiccorejava.functions;
import java.util.*;

public class Distance {
	public static void EuclideanDistance(double x1,double y1) {
		double distance = Math.sqrt((Math.pow(x1, 2) + (Math.pow(y1, 2))));
		System.out.println("Eucledian distance between entered coordinates to origin is = "+distance);
	} 
	public static void main(String[] args) {
		System.out.println("Enter the coordinates x1 and y1");
		Scanner sc = new Scanner(System.in);
		double x1 = sc.nextDouble();
		double y1 = sc.nextDouble();
		EuclideanDistance(x1,y1);
	}
}
