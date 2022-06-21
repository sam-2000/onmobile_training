package day3;
abstract class Language {

	  // method of abstract class
	  public void display() {
	    System.out.println("This is Java Programming");
	  }
	}

	
	  
public class Interface1 extends Language {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   // create an object of Main
	    Interface1 obj = new Interface1();
	    // access method of abstract class
	    // using object of Main class
	    obj.display();
		

	}

}
