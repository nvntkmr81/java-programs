package main.java.com.java_programs;

import java.util.HashMap;
import java.util.Map;

public class StringSplit {
	
	public static void main(String[] args) {
		String org = "Selenium is a very very very good tool";
		String[] words = org.split(" ");
		int num=1;
		Map<String,Integer> map = new HashMap<String,Integer>();
		for(String word : words){
			if(map.get(word)==null){
				map.put(word, num);
			}
			else{
				map.put(word, (map.get(word)+1));
			}
		}
		System.out.println(map);
	}

}
