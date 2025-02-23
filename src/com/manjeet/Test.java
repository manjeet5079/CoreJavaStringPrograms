package com.manjeet;

public class Test {

	public static final synchronized strictfp void main(String... args) {
		
		//... 3 dot is a var args method 
		
		String s1= new String("Test");
		String s2 = new String("Test");
		
		if(s1==s2) {
			System.out.println("s1 and s2 are eqluals of == operator");
		}if (s1.equals(s2)) {
			System.out.println("s1 and s2 are equals of equals method");
		}
		if(s1.hashCode()==s2.hashCode()) {
			System.out.println("s1 and s2 hash code are same");
			System.out.println("s1.hashCode()--"+s1.hashCode());
			System.out.println("s2.hashCode()--"+s2.hashCode());
		}
		if(s1.equals(s2)) {
			System.out.println("s1 and s2 are eqluals by equal method");
		}
		
	}
}
