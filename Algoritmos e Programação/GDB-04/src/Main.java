import java.util.Scanner;

public class Main {

	public static boolean cpfValidation(String cpf) {
		if(cpf.length()==11) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String cpf = sc.nextLine();

		boolean valido = cpfValidation(cpf);
		if(valido == true) {
			System.out.println("valido");
		}
		else if(valido == false) {
			System.out.println("invalido");
		}
		sc.close();
	}

}