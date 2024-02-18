package labs;

import java.util.Scanner;

public class lab_6_2 {
	public static void main(String[] args) {
		String myPassword = "password123";
	System.out.println("Please input your password:");
	Scanner scanner = new Scanner(System.in);
	String myInputPassword = scanner.next();
	
for (int i = 0;  i < 2; i ++) {
	if(myInputPassword.equals(myPassword)) {
		System.out.println("You input the correct password!!!");
		break;
	} else {
	System.out.println("Please input your password again!!!");
	myInputPassword = scanner.next();}
}
	}
	
}
