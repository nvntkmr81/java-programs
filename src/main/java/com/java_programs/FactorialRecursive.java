package main.java.com.java_programs;


public class FactorialRecursive {
	public static void main(String[] args) {
		int val = 5;
		System.out.println(factorial(val));
	}

	private static int factorial(int fact) {
		if (fact==0)return 1;
		else return fact*factorial(fact-1);
	}

}
