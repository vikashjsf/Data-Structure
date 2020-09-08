//Decimal to octal and Octal to Decimal
package com.problem.soving00;

public class PDecimal2Octal {
	public static void main(String[] args) {
		int num = 78;
		int octal  =  deciaml2Octal(num);
		System.out.println("Decimal : " + octal);
		int decimal = octal2Decimal(deciaml2Octal(num));
		System.out.println("Octal : "+decimal);
	}
	
	public static int deciaml2Octal(int num) {
		int decimal = 0, i = 1;
		while (num > 0) {
			int rem = num % 8;
			decimal = decimal + rem * i;
			num = num / 8;
			i = i * 10;
		}
		return decimal;
	}
	
	public static int octal2Decimal(int octalNum) {
		int decimal = 0, i = 0;
		while (octalNum != 0) {
			int rem = octalNum % 10;
			System.out.println("Rem : " + rem);
			decimal = decimal + (int) (rem * Math.pow(8, i));
			octalNum = octalNum / 10;
			i++;
		}
		return decimal;
	}
}
