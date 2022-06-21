package day2;

public class Arraysumandaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
		int sum=0;
		//Double avg;
		
		for (int i :numbers) {
			sum+=i;
		}
		int arrayLength = numbers.length;
		
		//average = ((double)sum/(double)arrayLength);
		double avg = (double)(sum/arrayLength);
		
		System.out.println("Sum = "+sum);
		System.out.println("Average= "+avg);
	}

}
