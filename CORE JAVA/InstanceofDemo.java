package day2;

class Fruit{}
class Vehicle{}
public class InstanceofDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fruit Apple = new Fruit();
		Vehicle truck = new Vehicle();
		
		System.out.println("Apple is a fruit "+(Apple instanceof Fruit));
		System.out.println("truck is a vehicle: "+ (truck instanceof Vehicle));
		//System.out.println("truck is a fruit: "+ (truck instanceof Fruit)); -- error

	}

}
