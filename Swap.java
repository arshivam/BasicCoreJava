package com.basiccorejava;
import java.util.*;  

public class Swap {
	public static void main(String[] args) {  
		int x, y, t;// x and y are to swap   
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter the value of X and Y");  
		x = sc.nextInt();  
		y = sc.nextInt();  
		System.out.println("before swapping numbers: X : "+x +" Y :"+ y);  
		/*swapping */  
		t = x;  
		x = y;  
		y = t;  
		System.out.println("After swapping numbers: X : "+x +" Y :" + y);  
	}    
}
