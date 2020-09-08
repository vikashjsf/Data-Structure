package com.problem.soving01;

import java.util.HashMap;
import java.util.Iterator;

public class SNumberOddTimes {
	public static void main(String[] args) {
		//int[] arr = { 1, 1, 2, 2, 3, 4, 4 };
		int []arr={ 10, 10, 10, 11, 11, 11,10};
		//numberOddTimes(arr);
		numberOddTimesUsingHashTable(arr);
	}
	//Using XOR operation
	public static void numberOddTimes(int []arr) {
		int oddTimes=arr[0];
		for (int i = 1; i < arr.length; i++) {
			oddTimes = oddTimes ^ arr[i];
		}
		System.out.println("oddNumber of Times : "+oddTimes);
	}
	//Using HashTable
	public static void numberOddTimesUsingHashTable(int[]arr) {
		HashMap<Integer, Integer> map = new HashMap<Integer,Integer>();
		for (int num : arr) {
			if(map.containsKey(num)) {
				map.put(num, map.get(num)+1);
			}else {
				map.put(num, 1);
			}
		}
		Iterator<Integer> it = map.keySet().iterator();
		while(it.hasNext()) {
			int key = it.next();
			if(map.get(key)/2==1)
				System.out.println("Occurence of Odd Number of times : "+key);
		}
	}
}
