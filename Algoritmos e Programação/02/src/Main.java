import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void val(double n, double m) {
		
		double media = (n+m)/(2);
		
		System.out.println("A media aritimetica é: "+media);
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = sc.nextDouble();
		double m = sc.nextDouble();
		
		val(n,m);

	}

}
