package quest;

public class Rightangle {
	int e=101;
	public void a1() {
	for(int a= 1; a<=5; a++) {
		for(int b=1; b<=a; b++) {
			System.out.print("*");}
			System.out.println();
		}
	}
	public static void a2() {
		for (int c=1; c<=4; c++)
		{
			for(int d=4; d>=c; d--) {
				System.out.print("*");}
			System.out.println();
			}
		
	} 
	public void line() {
		for(int g=1; g<=15;g++)
	System.out.print(g);
	}
	public static void main(String[] args) {
		
		a2();
		Rightangle obj = new Rightangle();
		obj.a1();
		a2();
		obj.a1();
		a2();
		obj.a1();
		obj.line();
	
		}}
		