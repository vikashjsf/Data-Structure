//Decimal number to binary number conversation
package com.problem.soving00;

public class OBinaryNumber {
	public static void main(String[] args) {
		int num = 15;
		int binary = convertIntoBinaryNumber(num);
		System.out.println("Binary : "+binary);
		int decimal = binary2Decimal(binary);
		System.out.println("Decimal Number : "+decimal);
	}
	
	public static int convertIntoBinaryNumber(int num) {
		int binary =0, i=1;
		while(num > 0 ) {
			int rem = num % 2;
			binary = binary + rem * i;
			num = num / 2;
			i = i * 10;
		}
		return binary;
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
	
	public static int binary2Decimal(int binary) {
		int decimal= 0, i = 0;
		while(binary > 0) {
			int rem = binary % 10;
			decimal = decimal + (int)(rem * Math.pow(2, i));
			binary = binary / 10;
			i++;
		}
		return decimal;
	}
	 
}
