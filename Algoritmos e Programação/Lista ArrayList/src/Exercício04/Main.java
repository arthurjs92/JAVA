package Exerc?cio04;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String nome, tel, cel, email;
		ArrayList<Contato> list = new ArrayList<Contato>();
		int op = Integer.parseInt(JOptionPane.showInputDialog("Menu\n 1. Adicionar Contato\n 2. Listar Contatos\n3.Sair\n"));
		do {
			switch (op) {
			case 1:
				nome = JOptionPane.showInputDialog("Digite o nome: ");
				tel = JOptionPane.showInputDialog("Digite o telefone: ");
				cel = JOptionPane.showInputDialog("Digite o celular: ");
				email = JOptionPane.showInputDialog("Digite o email: ");
				list.add(new Contato(nome, tel, cel, email));
				break;
			case 2:
				for (int i=0; i < list.size();i++) {
					Contato contato = list.get(i);
					JOptionPane.showMessageDialog(null, "Contato "+ (i+1) + "\nNome: " + contato.getNome() + "\nTelefone: " + contato.getTel() + "\nCelular: " + contato.getCel() + "\nEmail: " + contato.getEmail());
					}
				break;
			}
			op = Integer.parseInt(JOptionPane.showInputDialog("Menu\n 1. Adicionar Contato\n 2. Listar Contatos\n3.Sair\n"));
		} while (op !=3);
	}

}
