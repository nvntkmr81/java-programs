package main.java.com.java_programs;

public class Factorial {
	public static void main(String args[]){
		
		Calculate fact = new Calculate();
		fact.calculate(6);
	}
}

class Calculate{
	
	void calculate(int num){
		
		int loop = num-1;
		int value =1;
		for(int i=1; i<=loop; i++){
			 value = value*num;
			 num = num-1;
			
		}
		System.out.println(value);
		
	}
}
