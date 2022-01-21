package com.basiccorejava;
import java.util.*;

public class HeadTail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no of flips");
		int n = sc.nextInt();
		double head = 0 ;
		double tail = 0 ;	
		for(int i=0;i<n;i++) {
			double result = Math.random();
			if (result < 0.5) {
				System.out.println("tail ");
				tail++;
				// 				its Tails
			}
			else {
				System.out.println(" Heads ");
				head++;
				//                  its Heads	
			}
		}
		System.out.println("Percentage of Heads :"+head/n*100+"%");
		System.out.println("Percentage of Tails :"+tail/n*100+"%");
	}
}
