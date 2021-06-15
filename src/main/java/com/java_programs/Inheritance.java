package main.java.com.java_programs;

 class A {
	
	public char getChar(){
		char  c ='B';
		
		return c;
	}
	public String getString(){
		return "Navneet";
	}

}

class B extends A{
	@Override
	 public char getChar(){
		return 'A';
		
	}
}
public class Inheritance{
	public static void main(String[] args){
		A char1 = new A();
		B char2 = new B();
		System.out.println(char1.getChar());
		System.out.println(char2.getChar());
		System.out.println(char2.getString());
		
	}
}