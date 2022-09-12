package org.types_of_variables;

public class Testing extends Test {
	
	@Override
	public void name() {
		super.name();
	}

	@Override
	public void main() {
		System.out.println("This is an Abstract Method");
		
	}

	public static void main(String[] args) {
		Testing t = new Testing();
		t.name();
		t.main();
	}

}
