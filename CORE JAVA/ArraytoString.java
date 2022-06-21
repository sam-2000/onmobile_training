package day2;
import java.util.Arrays;

public class ArraytoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = {1,2,3};
		int[] arr2= {4,5,6};
		
		int alen = arr1.length;
		int blen=arr2.length;
		int[] result = new int[alen+blen];
		
		System.arraycopy(arr1,0,result,0,alen);
		System.arraycopy(arr2,0,result,alen,blen);
		//System.out.println(result);
		
		System.out.println(Arrays.toString(result));
		//System.out.println(arr1+arr2);
	}

}
