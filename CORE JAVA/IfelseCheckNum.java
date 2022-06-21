package com.abc;

public class IfelseCheckNum {
	static {
		int z = 20;
		System.out.println("static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = -10;
		
		b:{
			System.out.println("In a block");
			int x = 5;
			System.out.println(x);		/*	if (x==5) {
				System.out.println("In if");
				x =1;
				//continue b;
				
			}*/
			
		for (int i=1;i<=5;i++) {
			continue ;
		}
			
		}
		
		
		
		
		if (number>0) 
			System.out.println("The number is positive");
		
		else {
			System.out.println("The number is not positive");
		}
		System.out.println("Statement outside if...else block");
	}

}
