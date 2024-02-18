package labs;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_4 {
	
	public static void main(String[] args) {
		generateArrayList();
		chooseOptions();
	}

	private static void chooseOptions() {
		List<Integer> randomList = generateArrayList();
		int outLoop = 0;
	do {
		
		int optionNumber = printMenu();
		
		if (optionNumber == 1) {
			System.out.printf("The number in your array list are: " + randomList);
			outLoop ++;
		} else if (optionNumber == 2) {
			int maxNumber = findMax(randomList);
			System.out.printf("The maximum number in your array list is: %d", maxNumber);
			outLoop ++;
		} else if (optionNumber == 3) {
			int minNumber = findMin(randomList);
			System.out.printf("The minimum number in your array list is: %d", minNumber);
			outLoop ++;
		} else if (optionNumber == 4) {
			searchNumber(randomList);
			outLoop ++;}
			else {
			System.out.println("Your number is out of range!!!\n");	
		}
		
	} while (outLoop < 1);
		
	}

	private static void searchNumber(List<Integer> randomList) {
		
		System.out.println("Please input the number you want to search: \n");
		Scanner scanner = new Scanner(System.in);
		int searchNumber = scanner.nextInt();
		
        for (int i = 1; i < randomList.size(); i++) {
            int current = randomList.get(i);
            if (searchNumber == current) {
                System.out.printf("The search number: %d is available in the array list", searchNumber);
                break;
            } 
        }
        System.out.printf("The search number: %d is NOT available in the array list", searchNumber);
        scanner.close();
	}

	private static int findMin(List<Integer> randomList) {
		int min = randomList.get(0);
		
        for (int i = 1; i < randomList.size(); i++) {
            int current = randomList.get(i);
            if (current < min) {
                min = current;
            }
        }
		return min;
	}

	private static int findMax(List<Integer> randomList) {
		int max = randomList.get(0);
		
        for (int i = 1; i < randomList.size(); i++) {
            int current = randomList.get(i);
            if (current > max) {
                max = current;
            }
        }
		return max;
	}

	private static int printMenu() {
		System.out.println("=====MENU=====\n1. Print all numbers\n2. Print maximum value\n3. Print minimum value\n4. Search Number\n");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your favorite number: ");
		int optionNumber = scanner.nextInt();
		return optionNumber;
	}

	private static  List<Integer> generateArrayList() {
		SecureRandom randomNumber  = new SecureRandom();
		
		int randomInt = randomNumber.nextInt(1000);
		int randomInt01 = randomNumber.nextInt(1000);
		int randomInt02 = randomNumber.nextInt(1000);
		int randomInt03 = randomNumber.nextInt(1000);
		int randomInt04 = randomNumber.nextInt(1000);
		int randomInt05 = randomNumber.nextInt(1000);
		int randomInt06 = randomNumber.nextInt(1000);
		int randomInt07 = randomNumber.nextInt(1000);
		int randomInt08 = randomNumber.nextInt(1000);
		int randomInt09 = randomNumber.nextInt(1000);
		
		List<Integer> randomList = new ArrayList<Integer>();
		randomList.add(randomInt);
		randomList.add(randomInt01);
		randomList.add(randomInt02);
		randomList.add(randomInt03);
		randomList.add(randomInt04);
		randomList.add(randomInt05);
		randomList.add(randomInt06);
		randomList.add(randomInt07);
		randomList.add(randomInt08);
		randomList.add(randomInt09);

		return randomList;
	}

}
