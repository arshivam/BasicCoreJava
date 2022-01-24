package com.basiccorejava.functions;
import java.util.*;

public class Quadratic {
	public static int Equation(int a,int b,int c ) {
		int delta = b*b - 4*a*c;
		return delta;	
	}
	public static void main(String[] agrs) {
		System.out.println("Enter the value for Quadratic Equation : a*x^2+bx+c");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		System.out.println("The Quadratic Equation is ="+a+"x^2+"+b+"x+"+c);

		int result=Equation(a,b,c);
		int root1 = (int) ((-b + Math.sqrt(result)) / (2*a));
		int root2 = (int) ((-b - Math.sqrt(result)) / (2*a));
		System.out.println("ROOTS OF THE EQUATION ARE = "+root1 +"," +root2);

	}
}
