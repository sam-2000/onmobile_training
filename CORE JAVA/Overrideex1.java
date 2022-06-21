package day3;

class Animal {
	public void eat() {
		System.out.println("I can eat");
	}
}

class Dog extends Animal{
	public void eat() {
		//super.eat();
		System.out.println("I eat dog food");
	}
	
	public void bark() {
		System.out.println("I can bark");
	}
}

public class Overrideex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog hutch = (Dog) new Animal();
		hutch.eat();
		//hutch.bark();

	}

}
