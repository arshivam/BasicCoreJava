package com.basiccorejava.functions;
import java.io.*;
import java.util.*;

public class TwoDArray {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		PrintWriter print = new PrintWriter(System.out);
		System.out.println("Enter the Rows and Columns For MATRIX:");
		int rows = sc.nextInt();
		int colm = sc.nextInt();

		int[][] numbers = new int[rows][colm];
		//input
		//rows
		for(int i=0; i<rows; i++) {
			//columns
			for(int j=0; j<colm; j++) {
				numbers[i][j] = sc.nextInt();
			}
		}
		//output
		for(int i=0; i<rows; i++) {
			for(int j=0; j<colm; j++) {
				print.print(numbers[i][j]+" ");
				
			}
			print.println();
		}
		print.close();
	}
}