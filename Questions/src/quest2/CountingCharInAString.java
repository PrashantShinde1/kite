package quest2;

public class CountingCharInAString {
	public static void main(String [] args) { 
		//program for calculating the characters in the given string
		// Given string is "I am Prashant and I am the best"
		String a= "I am Prashant and I am the best";
		int b= 0;
		for (int c=0; c<a.length();c++) {
			if(a.charAt(c)!=' ')
				b++;}
		System.out.println("Total numbers in the string are" + b);
	
	}
}