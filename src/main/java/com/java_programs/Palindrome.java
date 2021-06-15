package main.java.com.java_programs;

public class Palindrome {
	public static void main(String[] args) {
		Check value=new Check();
		if(value.isPalindrome("Hannah"))
			System.out.println("It's a Palindrome");
		else System.out.println("It's not a Palindrome");
		
	}
}

class Check{
	boolean isPalindrome(String value){
		value =value.toLowerCase();
		int len;
		len = value.length();
		int loop = len/2 + 1;
		 for(int i = 1; i<loop;){
			if( value.charAt(i-1) == value.charAt(len-(i-1)-1)){
				i++;
				continue;
			}
			else {
				return false;
				
				}
		 }
		
		return true;

	}
	
	boolean isPalindrome(int value){
		
		int sum=0,n=value,r;
		while(n>0){
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(value==sum)return true;
		else return false;
	}
	
}






















