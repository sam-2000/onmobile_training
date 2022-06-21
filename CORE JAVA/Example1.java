package com.abc;

public class Example1 {
	static int x=1;
	private int y=3;
	public void method1(int x) {
		Example1 t = new Example1();
		this.x = 2;
		y = 4;
		
		System.out.println("Example1.x: "+ Example1.x);
		//System.out.println(Ex);
		System.out.println("t.x: "+t.x);
		System.out.println("t.y: "+t.y);
		System.out.println("y: "+y);
		
		
	}
	
	
	public static void main(String[] args) {
		Example1 t = new Example1();
		t.method1(7);
		//System.out.println("Hi");
	}
}
