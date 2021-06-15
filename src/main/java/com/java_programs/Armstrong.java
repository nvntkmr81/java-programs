package main.java.com.java_programs;

public class Armstrong {
	public static void main(String[] args) {
		CheckArmstrong num = new CheckArmstrong();
		int i=1;
		
		while(i<10000){
		if(num.isArmstrong(i))System.out.println(i);//System.out.println("It's an Armstrong no.");
		//else System.out.println("It's not an Armstrong no.");
		i++;
		}
			
	}
}

class CheckArmstrong{
	boolean isArmstrong(int value){
		int digit= countDigit(value);
		int r,sum=0,n=value;
		while(n>0){
			r=n%10;
			int mul =r;
			for(int i=1;i<digit;i++){
				r=r*mul;
			}
			sum=sum+r;
			n=n/10;
			
		}
		if (sum==value)return true;
		else
		return false;
	}
	
	int countDigit(int value){
		int count=0,n=value;
		while(n>0){
			n=n/10;
			count++;
		}
		return count;
	}
}
