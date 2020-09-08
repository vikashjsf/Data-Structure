//How to check if a number is a palindrome or not in Java
package com.problem.soving00;

public class BPalindromCheckOfANumber {
	public static void main(String[] args) {
		int num = 101;
		palindromCheck(num);
		
	}
	
	public static int palindromCheck(int num) {
		 int temp = num;
		 int rev = 0 ;
		 while(num > 0) {
			 rev = rev * 10 + num % 10;
			 num = num / 10;
		 }
		 System.out.println("Rev : "+rev + " Temp : "+temp );
		if(temp ==rev) {
			System.out.println(temp + " is Palindrom Number : ");
		}else {
			System.out.println(temp + " is not Palindrom Number : ");
		}
		return rev;
	}
}
