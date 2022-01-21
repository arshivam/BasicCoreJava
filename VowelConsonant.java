package com.basiccorejava;
import java.util.*;

public class VowelConsonant {

	public static void main(String[] args) {
		System.out.println("Enter the Alphabet : ");
		Scanner sc = new Scanner(System.in);
		char alpha = sc.next().charAt(0);
		System.out.println("You Entered the Alphabet :"+alpha);
		if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u' ) {
			System.out.println("It is a Vowel.");
		}   
		else {
			System.out.println("It is a Consonant.");
		}
	}
}
