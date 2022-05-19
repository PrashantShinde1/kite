package questions;

import java.util.Scanner;

public class C {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enter Number to check is it pallendrom or not");
		String A = Scan.next();
		int len= A.length();
		for(int i = A.length()-1; i>=0; i--) {
			System.out.println(A.charAt(i));
		}
		String B= "101";
		 StringBuilder stringBuildervarible = new StringBuilder();
	        stringBuildervarible.append(B);
	        stringBuildervarible.reverse();
	    
	    System.out.println(stringBuildervarible);
	}

}
