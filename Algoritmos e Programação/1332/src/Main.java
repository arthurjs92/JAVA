import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		String palavra;
		
		for(int i=0;i<n;i++) {
			palavra = sc.next();
			if(palavra.length()<4) {
				if((palavra.charAt(0) == 'o' && palavra.charAt(2) == 'e') || (palavra.charAt(0) == 'o' && palavra.charAt(1) == 'n') || (palavra.charAt(1) == 'n' && palavra.charAt(2) == 'e')) {
					System.out.println("1");
				}
				else System.out.println("2");
			}
			else System.out.println("3");
		}
	}

}
