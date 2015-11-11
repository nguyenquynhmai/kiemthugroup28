import java.util.Scanner;

public class Triangle {
	
	
	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		Scanner scan = new Scanner(System.in);
		try {
			a = scan.nextInt();
			b = scan.nextInt();
			c = scan.nextInt();
			if ((a < b + c) && (b < a + c) && (c < a + b)) {
				if ( a == b || b == c || c == a) {
					System.out.println("La 3 canh cua tam giac can");
				}
				System.out.println("La 3 canh cua tam giac");
			} else {
				System.out.println(" La 3 canh cua tam giac");
			}
		} catch (Exception e) {
			System.out.println("You must enter the three number above");
		}
		scan.close();
	}
}
