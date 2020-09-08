package com.problem.soving00;

public class ZZZTest {
	
	/*public static void main(String[] args) {
		int[] arr = {70,20,30,15,5,45,25,100};
		int firstMin = Integer.MAX_VALUE;
		int secodMin = Integer.MAX_VALUE;
		
		for (int num : arr) {
			if(firstMin > num ) {
				secodMin = firstMin;
				firstMin=num;
			}else if(secodMin > num) {
				secodMin=num;
			}
		} 
		 
		
		System.out.println("FirstMax : "+firstMin);
		System.out.println("SecondMax :"+secodMin);
		
	}*/
	
	public static void main(String[] args) {
		System.out.println("Passcal triangle");
		int rows = 6;

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < rows - i; j++) {
				System.out.print("@|");
			}

			int number = 1;
			for (int j = 0; j <= i;) {
				System.out.format("%4d", number);
				System.out.println(" Befor number:"+number + " i: "+i +" j: "+j);
				number = number * (i - j) / (j + 1);
				j=j+1;
				System.out.println(" After number:"+number + " i: "+i +" j: "+j);
			}
			System.out.println();
		}
	}
}
