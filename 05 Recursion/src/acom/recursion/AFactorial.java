package acom.recursion;

public class AFactorial {
	public static void main(String[] args) {
		int fact = factorial(10);
		System.out.println("Factorial : "+fact);
	}
	
	public static int factorial(int n) {
		System.out.println("Value of n : "+n);
		if(n==0) {
			return 1;
		}else {
			int result = n * factorial(n-1);
			System.out.println("N:"+n + " : result : "+result);
			return result;
		}
	}
}
