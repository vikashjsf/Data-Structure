package com.problem.soving00;

public class CArmStrongNumber {
	public static void main(String[] args) {
		int num = 153;
		checkArmStrongNumber(num);
	}
	
	public static void checkArmStrongNumber(int num) {
		int armStrong = num; 
		int sum = 0;
		while(num > 0) {
			int lastDigit = num % 10;
			//sum = sum + (lastDigit * lastDigit * lastDigit);
			sum = (int) (sum + Math.pow(lastDigit, 3));
			num = num /10;
		}
		if(sum == armStrong) {
			System.out.println(armStrong +" is ArmStrong Number!!");
		}else {
			System.out.println(armStrong + " is not ArmsStrong Number !!!");
		}
	}
/*

1.	An Armstrong number is a 3 digit number for 
	which sum of cube of its digits is equal to the number itself. 
An example of Armstrong number is 153 as 153= 1+ 125+27 which is equal 	to 1^3+5^3+3^3.

*/
}
