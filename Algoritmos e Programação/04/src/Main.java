import java.util.Locale;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = 0, m=0, cont=0,cont1=0;
		System.out.println("Digite um numero ou digite 0 para sair: ");
		n = sc.nextInt();
		while (n != 0){
			if(n>0) {
				m = m + n;
				System.out.println("Digite outro numero ou digite 0 para sair: ");
				n = sc.nextInt();
				cont++;
			}
			if(n<0) {
				m = m + n;
				System.out.println("Digite outro numero ou digite 0 para sair: ");
				n = sc.nextInt();
				cont1++;
			}
		}
		
		if(n==0) {
			System.out.println(cont);
			System.out.println(cont1);
		}
		sc.close();
	}
}
