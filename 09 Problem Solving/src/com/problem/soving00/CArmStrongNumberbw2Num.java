//Armstrong Numbers between two integers
package com.problem.soving00;

public class CArmStrongNumberbw2Num {
	public static void main(String[] args) {
		int low = 100;
		int high = 999;
		armStrongNumberBw2Number(low, high);
	}
	
	public static void armStrongNumberBw2Number(int low, int high) {
		for (int i = low + 1; i <= high; i++) {
			// Find the number of digit of a given number
			int x = i;
			int n = 0;
			while (x > 0) {
				x = x / 10;
				n++;
			}
			x = i;
			int pal = 0;
			while (x > 0) {
				int rem = x % 10;
				pal = (int) (pal + Math.pow(rem, n));
				x = x / 10;
			}

			if (i == pal) {
				System.out.println(i);
			}
		}
	}
}
