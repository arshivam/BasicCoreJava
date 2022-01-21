package com.basiccorejava;
import java.util.*;

public class PowerOf2 {
	public static void main(String[] args) {
		System.out.println("Enter the Power For 2 :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int result =0;
		for (int i=0;i<=n;i++) {
			result = (int) Math.pow(2, n);
		}
		System.out.println("power of 2 is "+result);
	}
}
