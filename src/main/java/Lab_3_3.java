package mobileJAVA;


public class Lab_3_3 {
	public static void main(String[] args) {
		int[] intArr = {1, 0, 11, 4, 9, 2};
		
		for (int i = 0; i < intArr.length; i++) {
			for (int j = i + 1; j < intArr.length; j++) {
			
				if (intArr[j] < intArr[i]) {
					int temp = intArr[j];
					intArr[j] = intArr[i];
					intArr[i] = temp;
				}
			}
		}
		for (int i = 0; i < intArr.length; i++) {
			System.out.println(intArr[i]);
		}

	
	}
}
