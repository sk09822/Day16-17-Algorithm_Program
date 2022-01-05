package com.blz.day16.day17;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	private static boolean isAnagram(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		if(Arrays.toString(c1).equals(Arrays.toString(c2)))
			return true;
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st string");
		String s1 = sc.next();
		System.out.println("Enter 2nd string");
		String s2 = sc.next();
		
		boolean checkAnagram = isAnagram(s1, s2);
		if (checkAnagram)
			System.out.println("Strings are Anagram");
		else
			System.out.println("Strings are not Anagram");
		
	}
	
}
