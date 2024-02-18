package labs;

import java.util.ArrayList;
import java.util.List;


public class lab_6_3 {
	public static void main(String[] args) {
		List<Integer> numberFromStr = new ArrayList<Integer>();
		String myString = "12345nabc678";
		char[] charArray = myString.toCharArray();
		for (char character : charArray) {
			if(Character.isDigit(character)) {
				numberFromStr.add(Integer.valueOf(String.valueOf(character)));
			} else if (Character.isLetter(character)) {
			}
		}
		System.out.println(numberFromStr);
	}
	
	
}
