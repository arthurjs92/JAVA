package Exercicio02;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		ArrayList <String> texto = new ArrayList<String>();	
		texto.add("Lucas Alvarenga");
		texto.add("Carla Fragoso");
		texto.add("Jo?o Sttifert");
		texto.add("Yun Haito");
		texto.add("Felicia Brum");
		int op = Integer.parseInt(JOptionPane.showInputDialog("Qual dos nomes abaixo voc? deseja excluir da lista?\r\n" + "1. Lucas Alvarenga\r\n" + "2. Carla Fragoso\r\n" + "3. Jo?o Sttifert\r\n" + "4. Yun Haito\r\n" + "5. Felicia Brum"));
		texto.remove(op-1);
		for(int i = 0; i < 4; i++) {
			System.out.println(texto.get(i));
		}
	}
}
