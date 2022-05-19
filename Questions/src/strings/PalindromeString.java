package strings;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		System.out.println("Enetr String To check Pallindrome");
		String a= Scan.next();
		String b="";
		for(int i=a.length()-1; i>=0; i--)
		{
			b=b+a.charAt(i);
		}
		if (b.equals(a))
		{System.out.println("Given String is a Pallindrome");}
		else {
		System.out.println("not a pallindrome");
		
			}
	
	}}
