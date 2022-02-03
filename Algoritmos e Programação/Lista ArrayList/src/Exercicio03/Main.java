package Exercicio03;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ArrayList <String> frases = new ArrayList<String>();
		String maiuscula;
		String [] palavra = new String[5];
		String frase;
		for(int i = 0; i<5; i++) {
			frase = JOptionPane.showInputDialog("Digite a " + (i+1) + "° frase: ");
			maiuscula = frase.toUpperCase();
			frases.add(maiuscula);
		}
		for(int i = 0; i < 5; i++) {
			maiuscula = frases.get(i);
			String[] pp = maiuscula.split(" ");
			palavra[i]= pp[0];
		}
		System.out.println(palavra[0] + " " + palavra[1] + " " + palavra[2] + " "  + palavra[3] + " "  + palavra[4]);
	}
}
