package main.java.com.java_programs;

public class StringReverse {
	public static void main(String[] args) {
		String org ="Selenium is a good tool";
		
		String[] words =  org.split(" ");
		String[] rev = new String[words.length];
		for(int i=0;i<words.length;i++){
			rev[i] = words[words.length-1-i];
		}
		
		for(String word : rev){
			System.out.print(word+" ");
		}
	}

}
