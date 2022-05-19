package strings;

import java.util.Scanner;

public class CapitalizeEachWordInString {
public static void main(String[] args) {
	Scanner Scan = new Scanner (System.in);
	System.out.println("Enter the String");
	String a= Scan.next();
	System.out.println(a.toUpperCase());
}
}
