package day2;

public class Arraysum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {3,4,5,-5,0,12};
		int sum =0;
		
		for (int number: numbers) {
			sum=sum+number;
		}
		System.out.println("Sum ="+sum);
	}

}
