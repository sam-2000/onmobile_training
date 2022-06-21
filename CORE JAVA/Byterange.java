package com.abc;

public class Byterange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte b = 126;
		
		//byte is 8 bit value
		System.out.println(b);
		
		
		b++;
		System.out.println(b);
		
		
		/*It overflows here because
		 byte can hold values from -128 to +127*/
		b++;
		System.out.println(b);
		
		//Looping back within the range
		b++;
		
		System.out.println(b);

	}

}
