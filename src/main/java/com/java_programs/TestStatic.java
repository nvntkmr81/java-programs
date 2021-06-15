package main.java.com.java_programs;

public class TestStatic {
	
	static int x;
	TestStatic(int y){
	x = y ;
		
	}
	void display(){
		System.out.println(x);
	}
	public static void main(String[] args) {
	TestStatic ts = new TestStatic(5);
	ts.display();
	}
	
}


