package main.java.com.java_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumTest extends StringTest{
	NumTest(){
		super("Navneet");
		System.out.println("Kumar");
		
	}
	public static void main(String[] args) {
		NumTest nt = new NumTest();
		int num = 156423575;
		nt.sort(num);
	}

	public void sort(int num){
		List<Integer> numList  = new ArrayList<Integer>();
		while(num>0){
			int rem = num%10;
			num = num/10;
			numList.add(rem);
		}
		
		Collections.sort(numList);
		System.out.println(numList);
		Collections.reverse(numList);
		System.out.println(numList);
	}

}
