package org.types_of_variables;


public class A {
	public void name() {
		this.name(10, 7878.25f);
		System.out.println("Hello");
		this.name(1);
	}
	public void name(int a) {
		System.out.println("Gopi");
		this.name("gopi@gmail.com");
		
	}
	
	public void name(int b,float c) {
		System.out.println(b);
		System.out.println(c);
	}
	public void name(String mail) {
		System.out.println(mail);
	}
	public void hai() {
System.out.println("12");
	}
	public static void main(String[] args) {
		A a = new A();
		a.name();
	}
}
