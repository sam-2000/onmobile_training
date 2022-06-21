package com.abc;

public class Trafficsignalcheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String signal = "Green";
		
		if (signal=="Red"){
			System.out.println("It's red, you need to stop here");
		
		}
		else if (signal=="Orange") {
			System.out.println("It's orange, be ready to go");
		}
		
		else {
			System.out.println("It's green, you can leave");
		}

	}

}
