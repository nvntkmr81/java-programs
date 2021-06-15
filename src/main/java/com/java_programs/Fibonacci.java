package main.java.com.java_programs;

public class Fibonacci {

	public static void main(String args[]){
		int num1, num2;
		num1 = 0;
		num2 = 1;
		int nextnum;
		System.out.println("Fibonacci Series:");
		System.out.print(num1 +" "+ num2 + " ");
		
		for (int i=0; i<8 ; i++){
			nextnum = num1 + num2;
			num1 = num2;
			num2 = nextnum;
			System.out.print(nextnum + " ");
		}
	}
}
