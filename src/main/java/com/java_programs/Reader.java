package main.java.com.java_programs;

import static main.java.com.java_programs.ReadProperties.getPropertyValue;;
public class Reader {
	
	public static void main(String[] args) {
		String name = getPropertyValue("name");
		String role = getPropertyValue("role");
		String dept = getPropertyValue("dept");
		
		System.out.println(name + " has " + role + " role in " + dept + " department.");
	}

}
