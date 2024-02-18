package labs;

import java.util.Arrays;

public class lab_6_1 {
	public static void main(String[] args) {
		String givenString = "4 hrs and 5 minutes";
		String[] hourAndMinutes = givenString.split("and");
		String hourString = hourAndMinutes[0].replaceAll("[^0-9]", "");
		String minString = hourAndMinutes[1].replaceAll("[^0-9]", "");
		int hourNum = Integer.parseInt(hourString);
		int minNum = Integer.parseInt(minString);
		System.out.printf("The total minutes is: %d mins", hourNum * 60 + minNum);

	}
}
