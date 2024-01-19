package mobileJAVA;

public class Lab_3_1 {
	
	public static void main(String[] args) {
		int[] intArr = {1, 3, 4, 6, 8, 10};
		int countEven = 0;
		int countOdd = 0;
		for (int i = 0; i < intArr.length; i++) {
			if(intArr[i] % 2 == 0) {
				countEven ++;
			}
			else {
				countOdd ++;
			}
		}
		
		System.out.println("Even number is: " + countEven);
		System.out.println("Odd number is: " + countOdd);
	}
}
