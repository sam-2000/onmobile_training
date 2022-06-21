package day2;

class A{}

class B extends A{}

public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();
		System.out.println("b is an instance of B: "+ (b instanceof B));
		System.out.println("B IS AN INSTANCE OF PARENT CLASS A: "+ (b instanceof A));

	}

}
