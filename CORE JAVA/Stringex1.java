package day3;

public class Stringex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String greet = "Hello World";
		System.out.println("String: "+ greet);
		
		System.out.println("Length: "+greet.length());
		
		System.out.println(greet.substring(0,7));
		System.out.println(greet.substring(0,5));
		System.out.println(greet.substring(3,5));
		
		
		System.out.println(greet.replace("World","Sam"));
		System.out.println("Java Programming".replace("Java","Python"));
		System.out.println(greet.replace("C", "C++"));
		
		
		
		System.out.println(greet.indexOf('l'));//first l place
		System.out.println(greet.indexOf('h'));//-1
		System.out.println(greet.indexOf('l'));//2
		System.out.println(greet.indexOf("llo"));//2
		System.out.println(greet.indexOf("progr"));//-1
		System.out.println(greet.indexOf(""));//0
		
		
	}

}
