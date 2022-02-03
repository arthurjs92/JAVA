import java.util.Scanner;

public class App {
	
	public static int[] le() {
		int vetor[] = new int[3];
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Digite lado a: ");
		vetor[0] = s.nextInt();
		System.out.println("Digite lado b: ");
		vetor[1] = s.nextInt();
		System.out.println("Digite lado c: ");
		vetor[2] = s.nextInt();
		
		return vetor;
	}
	
	public static void exibe(String name) {
		System.out.println("O triangulo é: " + name);
	}

	public static void main(String[] args) {
		int vetor1[] = new int[3];
		
		vetor1 = le();
		
		if(ValidaTriangulo.verifica(vetor1[0], vetor1[1], vetor1[2])) {
			Triangulo Calc = new Triangulo(vetor1[0], vetor1[1], vetor1[2]);
			exibe(Calc.tipoTriangulo(vetor1[0], vetor1[1], vetor1[2]));
		}
		else
			System.out.println("Os lados não formam um Triângulo.");
	}
}
