package main.java.com.java_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumToString {

	public static void main(String[] args) {
		
		//int num = 125478;
		String s_num="12345";
		NumToString ns = new NumToString();
		//ns.converter(num);
		ns.converter(s_num);
		
		
		
		
	}
	
	public void converter(int num){
		List<Integer> singleNum = new ArrayList<Integer>();
		while(num>0){
			int rem;
			rem = num%10;
			num=num/10;
			singleNum.add(rem);
		}
		
		
		Collections.reverse(singleNum);
		//System.out.println(singleNum);
		
		for(int value:singleNum){
			switch(value)
			{
			case 0: System.out.print("Zero ");break;
			case 1: System.out.print("One ");break;
			case 2: System.out.print("Two ");break;
			case 3: System.out.print("Three ");break;
			case 4: System.out.print("Four ");break;
			case 5: System.out.print("Five ");break;
			case 6: System.out.print("Six ");break;
			case 7: System.out.print("Seven ");break;
			case 8: System.out.print("Eight ");break;
			case 9: System.out.print("Nine ");break;
			}
		}
		
		
	}
	public void converter(String num){
		String[] singleNum = num.split("");
		
		
		
		//System.out.println(singleNum);
		
		for(String value:singleNum){
			switch(value)
			{
			case "0": System.out.print("Zero ");break;
			case "1": System.out.print("One ");break;
			case "2": System.out.print("Two ");break;
			case "3": System.out.print("Three ");break;
			case "4": System.out.print("Four ");break;
			case "5": System.out.print("Five ");break;
			case "6": System.out.print("Six ");break;
			case "7": System.out.print("Seven ");break;
			case "8": System.out.print("Eight ");break;
			case "9": System.out.print("Nine ");break;
			}
		
		
	}
	
}
}
