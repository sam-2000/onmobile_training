package day3;

class GenericsClass1 <T extends Number> {

	  public void display() {
	    System.out.println("This is a bounded type generics class.");
	  }
	}

public class Genericinheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			    // create an object of GenericsClass
			    GenericsClass1<Integer> obj = new GenericsClass1<>();
		

	}

}
