package lab5palindromes;

import java.util.Scanner;

public class PalindromeChecker {

	/*
	public static void main(String[] args) {
		System.out.println("Palindrome checker!! Enter a string to test.");
		System.out.println("DO NOT include punctuation unless it goes with the palindrome.");
		Scanner isIt = new Scanner(System.in);
		while(true) { //sorry for no stop code like "enter q to quit" but i ain't got time for that
			String test = isIt.nextLine();
			if(isAPalindrome(test)) {
				System.out.println("It is a palindrome!!");
			}
			else {
				System.out.println("Not a palindrome :-(");
			}
		}
	}
	*/
	
	//Main doesn't work unless this method is static
	public boolean isAPalindrome(String str) {
		str = str.toLowerCase().replaceAll(" ", ""); //ignore case & remove spaces
		//System.out.println(str);
		if(str.length() == 0) { //base case #1: an empty string
			return false;
		}
		else if(str.length() == 1) { //base case #2: string of length 1 is palindrome
			return true; 			// odd number length string
		}
		else if(str.length() == 2) { //base case #3: both chars must be same
			return str.charAt(0) == str.charAt(1); 	//even # length string
		}
		else {
			char a = str.charAt(0); char z = str.charAt(str.length()-1);
			str = str.substring(1, str.length()-1);
			if(a == z) {
				//System.out.println("a:" + a + " z:" + z);
				return isAPalindrome(str);
			}
			else {
				return false;
			}
		}
	}

}
