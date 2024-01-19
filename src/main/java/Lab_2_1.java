package mobileJAVA;

import java.util.Scanner;

public class Lab_2_1 {

	public static void main(String[] args) {
		
		Scanner scannerHeight = new Scanner(System.in);
		Scanner scannerWeight = new Scanner(System.in);
		
		System.out.println("Please input your weight(kg): ");
		float weight = scannerWeight.nextFloat();
		
		System.out.println("Please input your height(m): ");
		float height = scannerHeight.nextFloat();
		
		float BMI = weight / (height * 2);
		System.out.println("Your BMI is: " + BMI);
		
		if(BMI < 18.5) {
			System.out.println("You are Underweight!.");
		} else if (BMI >= 18.5 && BMI <= 24.9 ) {
			System.out.println("You are Normalweight!.");
		} else if (BMI >=25 && BMI <= 29.9) {
			System.out.println("You are Overweight!.");
		} else if (BMI >= 30) {
			System.out.println("You are Obesity!.");
		}
			
		scannerHeight.close();
		scannerWeight.close();
	}
	

}
