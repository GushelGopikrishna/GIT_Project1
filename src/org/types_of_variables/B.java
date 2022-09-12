package org.types_of_variables;

public class B extends A {
	
	@Override
	public void name() {
		System.out.println("Great Day");
		super.name();
	}
	@Override
	public void hai() {
		System.out.println("123");
		super.hai();
	}
	public void sub() {
		System.out.println("\n"+"Tamil");
		System.out.println("Engish");
		System.out.println("Maths");
		System.out.println("Science");
		System.out.println("Social");
	}
	public static void main(String[] args) {
		B b = new B();
		b.name();
		b.sub();
		b.hai();
	}
	
}