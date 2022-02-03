import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void val(int x, int y) {
		if(x<y) {
			System.out.println(x+" é menor que "+y);
		}
		else if(x>y) {
			System.out.println(x+" é maior que "+y);
		}
		else System.out.println(x + " é igual a "+y);
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int y = sc.nextInt();
		int x = sc.nextInt();
		
		val(x,y);
	}
}
