package main.java.com.java_programs;

public class StringReplace {
	
	public static void main(String[] args) {
		StringReplace sr = new StringReplace();
		System.out.println(sr.replaceInts("I will eat 2 burgers 23 fries & 1.25 cokes l8r"));
		
	}
	
	public String replaceInts(String str){
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) { 
            ch[i] = str.charAt(i); 
        } 
		
		for(int i=0;i<ch.length;i++){
			if(Character.isDigit(ch[i])){
				ch[i] = '*';
			}
		}
		
		String newStr = new String(ch);
		
		return newStr.replaceAll("^(?=.{8,20}$)(([*])\2?(?!\2))+$", "*");
	}

}
