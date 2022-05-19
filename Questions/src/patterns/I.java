package patterns;
//Sandglass Star Pattern
public class I {
	public static void top() {
		for (int a =1; a<=5; a++) {
			for (int b=1; b<=a; b++) {
				System.out.print(" ");}
			for(int c=5; c>=a; c--) {
				System.out.print(" *");}
			System.out.println();}}
	public static void bottom () {
		for(int d=1; d<=5; d++) {
			for (int e=5; e>=d; e--) {
				System.out.print(" ");}
			for(int f=1; f<=d;f++) 
			{System.out.print(" *");}
			System.out.println();
		}
		
	}
	
