package com.problem.soving00;

public class UdictionSort {
	public static void main(String[] args) {
		 String[] words = { "Ruby", "C", "Python", "Java" };
		 for (int i = 0; i < words.length; i++) {
			for (int j = 1 + i ; j < words.length; j++) {
				if(words[i].compareTo(words[j])>0) {
					String temp = words[i];
					words[i] = words[j];
					words[j] = temp;
				}
			}
		}
		for (int j = 0; j < words.length; j++) {
				System.out.println(words[j]);
		}
		 
	}
}
