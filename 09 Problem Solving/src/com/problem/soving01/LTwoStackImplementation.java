package com.problem.soving01;

import java.util.EmptyStackException;

public class LTwoStackImplementation {
	int firstIndex;
	int lastIndex;
	int size;
	int arr[];

	public LTwoStackImplementation(int num) {
		firstIndex = -1;
		lastIndex = num;
		arr = new int[num];
		size = num;
	}

	public boolean isStackFull() {
		return firstIndex == lastIndex;
	}

	public boolean isEmpty1() {
		return firstIndex == -1;
	}

	public boolean isEmpty2() {
		return lastIndex == size;
	}

	public void push1(int num) {
		if (isStackFull()) {
			throw new StackOverflowError();
		} else {
			arr[++firstIndex] = num;
		}
	}

	public void push2(int num) {
		if (isStackFull()) {
			throw new StackOverflowError();
		} else {
			arr[--lastIndex] = num;
		}
	}

	public int pop1() {
		int element;
		if (isEmpty1()) {
			throw new EmptyStackException();
		} else {
			element = arr[firstIndex--];
		}
		return element;
	}

	public int pop2() {
		int element;
		if (isEmpty2()) {
			throw new EmptyStackException();
		} else {
			element = arr[lastIndex++];
		}
		return element;
	}

	public void display() {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		LTwoStackImplementation twoStacks = new LTwoStackImplementation(5);
		twoStacks.push1(5);
		twoStacks.push1(4);
		twoStacks.push2(3);
		twoStacks.push2(2);
		twoStacks.push2(1);
		twoStacks.display();
		
		System.out.printf("1. Pop elements from stack1 : ");
		while (!twoStacks.isEmpty1()) {
			System.out.printf(" %d", twoStacks.pop1());
		}

		System.out.printf("\n2. Pop elements from stack2 : ");
		while (!twoStacks.isEmpty2()) {
			System.out.printf(" %d", twoStacks.pop2());
		}
	}

}
