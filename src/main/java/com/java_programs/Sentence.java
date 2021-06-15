package main.java.com.java_programs;


import java.util.HashMap;
import java.util.Map;

public class Sentence {
	public static void main(String[] args) {
		Words line = new Words();
		String sent = "This is a very very good tool";
		line.words(sent);
		
		
	}

}

class Words{
	public void words(String sent){
		Map<String, Integer> wordcount = new HashMap<String, Integer>();
		String[] word = sent.split(" ");// splits the string into characters
		
		//System.out.println(word.length);
		for(String ss:word){
			//System.out.println(ss);
			Integer n = wordcount.get(ss);
	        n = (n == null) ? 1 : ++n;
	        wordcount.put(ss, n);
		
		}
			for(Object objname:wordcount.keySet()) {
				   System.out.print(objname+": " );
				   System.out.println(wordcount.get(objname));
				 }
		}
		
	}



