package com.interview;

public class Test {
	public static void main(String[] args) {
		int n=5;
		int k=0,j=0;
		
		for (int i = 1; i <=5; i++) {
			 if(i % 2 !=0) {
				 for (j = k+1; j < k +i ; j++) {
					System.out.print( j + "*");
				}
				 System.out.println(j);
				 j++;
				 k=j;
			 }else {
				 k=k+i-1;
				 for (j = k; j >k-i+1; j--) {
					System.out.print(j+ "*");
				}
				 System.out.println(j);
			 }
		}
	}
}
