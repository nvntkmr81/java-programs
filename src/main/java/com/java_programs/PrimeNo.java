package main.java.com.java_programs;

public class PrimeNo {
	
	public PrimeNo(int count){
		
		int num=2;
		
		for(int i = 0; i<count; i++){
			int prime =check(num);
			System.out.print(prime+" ");
			
			num = prime+1;
			
		}
		System.out.println();
		
		
	}
	public PrimeNo(int a,int b){
		
		int value1= a;
		int value2= b;
		int prime=0;
		while (prime < value2){
			prime = check(value1);
			if (prime<value2 && prime>1)
			System.out.print(prime+" ");
			value1 = prime+1;
		}
		
	}
	private int check(int value){
			
			for(int j=2; j< value;){
				if (value%j!=0)j++;
				else{value++;j=2;}
			}
				
			return value;

	}
	public static void main(String args[]){
	 new PrimeNo(10);
	 new PrimeNo(5,15);
		
	}
}


