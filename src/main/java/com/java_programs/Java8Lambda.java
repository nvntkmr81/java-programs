package main.java.com.java_programs;

public class Java8Lambda {
	public static void main(String[] args) {
		Java8Lambda doer = new Java8Lambda();
		Calculator sum = (a, b) -> a + b;  //Lambda Expression
		Calculator sub = (a, b) -> a - b;
		Calculator mul = (a, b) -> a * b;
		Calculator div = (a, b) -> a / b;

		System.out.println("Division Of 10 by 5 is " + doer.operate(10, 5, div));
		System.out.println("Addition Of 10 and 5 is " + doer.operate(10, 5, sum));
		System.out.println("Substraction Of 10 and 5 is " + doer.operate(10, 5, sub));
		System.out.println("Multiplication Of 10 and 5 is " + doer.operate(10, 5, mul));
	}

	private int operate(int a, int b, Calculator mathOperation) {
		return mathOperation.operation(a, b);
	}

	@FunctionalInterface
	interface Calculator { // A Functional Interface "A functional Interface should have only one method" 
		int operation(int a, int b);
	}

}
