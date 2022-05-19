package patterns;
//downward right angle * pattern
public class e {

	public static void main(String[] args) {
	for(int a=1; a<=5; a++) {
		for(int b=5; b>=a; b--) {
			System.out.print(" *");
		}
		System.out.println();
	}

	}

}
