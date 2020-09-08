//Reverse a given number.
package com.problem.soving00;

public class AReverseAgivenNumber {
	public static void main(String[] args) {
		int num = 1234;
		int reverse = reverseNumber(num);
		System.out.println("Befor Reverse : " + num + " After Reverse :" + reverse);
	}

	public static int reverseNumber(int num) {
		int reverse = 0;
		while (num > 0) {
			int remender = num % 10;
			reverse = reverse * 10 + remender;
			num = num / 10;
		}
		return reverse;
	}
}
