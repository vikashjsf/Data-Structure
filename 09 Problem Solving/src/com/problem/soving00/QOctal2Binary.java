//Octal To Binary.
/*
	1 . Need to convert Octal to Decimal then Decimal to Binary and vice - versa
*/
package com.problem.soving00;

public class QOctal2Binary {
	public static void main(String[] args) {
		int octal = 40;
		int decimal  = octal2Decimal(octal);
		int binary = decimal2Binary(decimal);
		System.out.println("Octal :"+octal + " Decimal : "+decimal + " Binary :"+binary);
	}
	
	public static int octal2Decimal(int octal) {
		int decimal = 0 , i = 0;
		while(octal != 0 ) {
			int rem = octal % 10;
			decimal = decimal + (int)(rem * Math.pow(8, i));
			octal = octal / 10;
			i++;
		}
		return decimal ;
	}
	
	public static int decimal2Binary (int decimal) {
		int binary = 0, i =1;
		while (decimal > 0) {
			int rem = decimal % 2 ;
			binary = binary + rem * i;
			i = i *10;
			decimal = decimal / 2;
		}
		return binary;
	}
}
