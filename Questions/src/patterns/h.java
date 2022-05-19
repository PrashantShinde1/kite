package patterns;
//Left  Triangle Pascal’s
public class h {
	public static void top() {
		for(int a=1; a<=3; a++) {
			for (int b=3; b>=a; b-- ) {
				System.out.print(" ");
			}
			for(int c=1; c<=a; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	public static void bottom() {
		for(int d=1; d<=2; d++) {
			for(int e=0; e<=d; e++) {
				System.out.print(" ");}
		for (int f=2; f>=d; f--) {
			System.out.print("*");}
		System.out.println();
		}
	}
	public static void main(String[] args) {
	h.top();	
	h.bottom();
	}

}
