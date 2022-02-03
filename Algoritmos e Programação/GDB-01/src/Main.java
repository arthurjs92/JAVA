import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
        System.out.println("Digite o texto 1: ");
        String text1 = sc.nextLine();
        System.out.println("Digite o texto 2: ");
        String text2 = sc.nextLine();
        
        if(text1.equals(text2)) {
        	System.out.println("correto");
        }
        else System.out.println("incorreto");
        
        sc.close();
	}

}
