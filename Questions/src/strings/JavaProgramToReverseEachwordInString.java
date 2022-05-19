package strings;

public class JavaProgramToReverseEachwordInString {

	public static void main(String[] args) {
		String a = "India is Great country";
			String b [] =a.split(" ");//splitting string into a array
//			for (int i=0; i<=b.length-1; i++)
//			{System.out.print(b[i]+" ");}
//			System.out.println();
			for(int i=b.length-1; i>=0; i--)
			{
				System.out.print(b[i]+" ");
			}
	}

}
