package com.promineotech;

public class Week2Quiz {

	public static void main(String[] args) {

		int num = 7;
		String message;

		if (num > 10) {
		    message = "The number is greater than 10.";
		} else if (num > 5) {
		    message = "The number is greater than 5 but less than or equal to 10.";
		} else {
		    message = "The number is less than or equal to 5.";
		}

		System.out.println(message);
		
	}
}
