package patterns;
//Right Pascal’s Triangle *
public class g {
	public static void top() {
		for(int a=1; a<=5; a++) {
			for(int b=1; b<=a; b++) {
				System.out.print(" *");
			}
			System.out.println();
		}
	}
	public static void bottom() {
		for (int c=1; c<=4; c++) {
			for(int d=4; d>=c; d--) {
				System.out.print(" *");}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		g.top();
		g.bottom();
		
		
	}

}
