package patterns;
//reverse pyramid
public class f {

	public static void main(String[] args) {
		for(int a= 1; a<=5; a++) {
			for (int c= 1; c<=a; c++) {
				System.out.print(" ");
			}
		for(int b = 5; b>=a; b--) {
			System.out.print("* ");
		}
		
		System.out.println();

	}}

}
