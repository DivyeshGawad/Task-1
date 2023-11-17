package task1;

import java.util.Scanner;

public class Temperature_Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Temperature Converter");
		System.out.println("1. Celsius to Fahrenheit");
		System.out.println("1. Fahrenheit to Celsius");
		System.out.println("Enter Choice 1 or 2");

		int choice = sc.nextInt();

		switch (choice) {
		case 1: {
			convertCelsiusToFahrenheit();
			break;
		}

		case 2:
			convertFahrenheitToCelsius();
			break;
		default:
			System.out.println("Invalid Input");
		}
		
		sc.close();
	}

	public static void convertCelsiusToFahrenheit() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature in Celsius : ");
		double celsius = sc.nextDouble();

		double fahrenheit = (celsius * 9 / 5) + 32;
		
		System.out.println(celsius+" Celsius is : "+fahrenheit+"Fahrenheit.");
		
		sc.close();
	}

	public static void convertFahrenheitToCelsius() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter temperature in Fahrenheit : ");
		double fahrenheit = sc.nextDouble();

		double celsius = (fahrenheit - 32) * 5 / 9;

		System.out.println(fahrenheit+" Fahrenheit is " + celsius + " Celsius.");
		
		sc.close();
	}

}
