import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ArrayList <String> texto = new ArrayList<String>();	
		String nome;	
		for(int i = 0; i<5; i++) {
			nome = JOptionPane.showInputDialog("Digite o " + (i+1) + "nome: ");
			texto.add(nome);
		}
		
		for(int j = 4; j >= 0; j--) {
			System.out.println(texto.get(j));
		}
	}
}
