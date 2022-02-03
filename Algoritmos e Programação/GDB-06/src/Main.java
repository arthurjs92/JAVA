import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String frase = sc.nextLine();
		for(int i=0;i<frase.length();i++) {
			System.out.println(i + " - " + frase.charAt(i));
		}

	}

}
