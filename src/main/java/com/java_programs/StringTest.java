package main.java.com.java_programs;

import static main.java.com.java_programs.ReadProperties.getPropertyValue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;;


public class StringTest {
	StringTest(String str){
		System.out.println(getPropertyValue("name"));
		
	}
	
	public static void main(String[] args) {
		char[] test = {'a','c','b','f','e','d','g','h','h','a','Z'};
		String str = new String(test);
		StringTest st = new StringTest(str);
		st.sort(str);
		System.out.println(getPropertyValue("role"));
	}
	
	protected void sort(String str){
		
		List<String> strArray = new ArrayList<String>(Arrays.asList(str.split("")));
		Collections.sort(strArray);
		System.out.println(strArray);
		Collections.reverse(strArray);
		System.out.println(strArray);
	}

}
