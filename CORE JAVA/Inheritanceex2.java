package day3;

class Animals{
	protected String name;

	final void display() {
		System.out.println("I am an animal");
	}
}

class Dogs extends Animals {
	
	 /*public void display() {
		System.out.println("I am a dog");
	}*/
	public void getInfo() {
		System.out.println("name is : "+ name);
	}
	
	public void printMessage() {
		display();
		super.display();
	}
}


public class Inheritanceex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dogs hutch1 = new Dogs();
		hutch1.name="Labrador";
		hutch1.display();
		hutch1.getInfo();
		hutch1.printMessage();
		

	}

}
