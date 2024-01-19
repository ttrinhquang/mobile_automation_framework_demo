package mobileJAVA;

public class Lab_3_2 {
	public static void main(String[] args) {
		int[] intArr = {10, 2, 0, 4, 19, 11 };
		int minNumber = intArr[0];
		int maxNumber = intArr[0];
		for (int i = 0; i < intArr.length; i++) {

			if(intArr[i] > maxNumber) {
				maxNumber = intArr[i];
			}
			if(intArr[i] < minNumber) {
				minNumber = intArr[i];
			}
		}
		System.out.println("Maximum number is: " + maxNumber);
		System.out.println("Minimum number is: " + minNumber);
	}
}
