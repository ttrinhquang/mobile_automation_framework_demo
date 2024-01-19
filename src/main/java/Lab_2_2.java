package mobileJAVA;

import java.util.Scanner;

public class Lab_2_2 {

	public static void main(String[] args) {
		
		System.out.println("Please innput your favourite number: ");
		
		Scanner scannerNumber = new Scanner(System.in);
		
		int number = scannerNumber.nextInt();
		
		if(number % 2 == 0) {
			System.out.println("Your number is an even number!. ");
		}else {
			System.out.println("Your number is an odd number!. ");
		}

		scannerNumber.close();
	}

}
