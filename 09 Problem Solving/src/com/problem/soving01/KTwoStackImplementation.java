package com.problem.soving01;

public class KTwoStackImplementation {
	
	int topIndex;
	int lastIndex;
	int arr[];
	int size;
	
	public KTwoStackImplementation(int num) {
		arr = new int[num];
		topIndex=-1;
		lastIndex=num;
		size = num;
	}

	public void push1(int num) {
		// There is at least one empty space for new element
		if (topIndex < lastIndex - 1) {
			arr[++topIndex] = num;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}
	
	public void push2(int num) {
		// There is at least one empty space for new element
		if (topIndex < lastIndex - 1) {
			arr[--lastIndex] = num;
		} else {
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}
	
	public int pop1() {
		// There is at least one element should be present
		if (topIndex >= 0) {
			return arr[topIndex--];
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public int pop2() {
		// There is at least one element should be present
		if (lastIndex <= size-1) {
			return arr[lastIndex++];
		} else {
			System.out.println("Stack Underflow");
			System.exit(1);
		}
		return 0;
	}
	
	public void display() {
		for (int num : arr) {
			System.out.print(num + " ");
		}
		System.out.println();
	}
	// Driver program to test twoStack class
	public static void main(String args[]) {
		KTwoStackImplementation ts = new KTwoStackImplementation(5);
		ts.push1(5);ts.display();
		ts.push2(10);ts.display();
		ts.push2(15);ts.display();
		ts.push1(11);ts.display();
		ts.push2(7);ts.display();
		System.out.println("Given Elements ");
		ts.display();
		System.out.println("Popped element from" + " stack1 is " + ts.pop1());
		ts.push2(40);
		ts.display();
		System.out.println("Popped element from" + " stack2 is " + ts.pop2());
	}

	
}
