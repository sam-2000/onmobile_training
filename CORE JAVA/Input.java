package com.abc;

import java.util.Scanner;

public class Input {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		//Getting float input
		System.out.println("Enter float: ");
		float myFloat = sc.nextFloat();
		System.out.println("Float entered= "+myFloat);
		
		//Getting double input
		System.out.println("Enter double: ");
		double myDouble = sc.nextDouble();
		System.out.println("double entered= "+myDouble);
		
		//Getting String input
		System.out.println("Enter text: ");
		String myString = sc.next();
		System.out.println("Text entered= "+myString);

	}

}
