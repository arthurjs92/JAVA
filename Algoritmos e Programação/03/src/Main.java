import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void valor(int x, int y, int z) {
		if (x+y>z && x+z>y && y+z>x) {
			if(x==y && y==z) {
				System.out.println("È um triangulo equilatero.");
			}
			else if(x==y || y==z || x==z) {
				System.out.println("È um triangulo isoceles.");
			}
			else System.out.println("È um triangulo escaleno");
		}
		else System.out.println("Os dados digitados não formam um triangulo.");
	}

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		valor(x,y,z);
		
		sc.close();

	}

}
