package day01;

import accessModifier.B;

public class Test {
	public static void main(String[] args) {
		B b = new B();
		
		b.var1 = 3;
		b.setVar4(4);
		
		System.out.println(b.getVar4());
	}
}
