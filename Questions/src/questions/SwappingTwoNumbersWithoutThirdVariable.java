package questions;

import java.util.Scanner;

public class SwappingTwoNumbersWithoutThirdVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter any two numbers");
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		System.out.println("Numbers Before Swapping are" +" "+a+" "+b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("Numbers After Swapping are" +" "+a+" "+b);

	}

}
