package main;

import java.util.Scanner;

public class Converter {
	public static void main(String[] args) {
		int menuSelection = 0;
		
		while(menuSelection != 5) {
			System.out.println("Please select a conversion option: \n"
					+ "Distance Conversions:\n"
					+ "1. Miles to Kilometers\n"
					+ "2. Feet to Meters\n"
					+ "Volume Conversions:\n"
					+ "3. Tablespoons to Cups\n"
					+ "4. Pints to Ounces\n"
					+ "5. Quit\n");
			Scanner in = new Scanner(System.in);
			
			float convert;
			int num;
			switch (menuSelection = in.nextInt()) {
			case 1:
				System.out.println("Miles to Kilometers");
				System.out.println("Enter a number to convert from Miles to Kilometers");
				num = in.nextInt();
				convert = num * 1.60934f;
				System.out.println("The number of Kilometers is: " + convert);
				break;
			
			case 2: 
				System.out.println("Feet to Meters");
				System.out.println("Enter a number to convert Feet to Meters");
				num = in.nextInt();
				convert = num/3.281f;
				System.out.println("The number of Meters is: " + convert);
				
			case 3: 
				System.out.println("Cups to Tablespoons");
				System.out.println("Enter a number to convert from Cups to Tablespoons");
				num = in.nextInt();
				convert = num * 16f;
				System.out.println("The number of Cups is: " + convert);
				break;

			case 4:
				System.out.println("Pints to Ounces");
				System.out.println("Enter a number to convert from Pints to Ounces");
				num = in.nextInt();
				convert = num * 16f;
				System.out.println("The number of Ounces is: " + convert);
				break;
			
			default: 
				System.out.println("You have exited the unit converter");
				System.out.println("Have a nice day!");
				break;
			}
		}
	}
}
