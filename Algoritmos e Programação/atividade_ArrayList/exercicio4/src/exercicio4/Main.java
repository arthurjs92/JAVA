package exercicio4;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nome, tel, cel, email;
		int menu;
		
		ArrayList<Contato> listaContatos = new ArrayList<Contato>();
		
		menu = Integer.parseInt(JOptionPane.showInputDialog("****************************************\n                           Menu\n 1. Inserir Contato\n 2. Listar Contatos\n3.Sair\n ****************************************\n"));
   
		do {
			switch (menu) {
			case 1:
				nome = JOptionPane.showInputDialog("Digite o nome do contato: ");
				tel = JOptionPane.showInputDialog("Digite o número do telefone: ");
				cel = JOptionPane.showInputDialog("Digite o número do celular: ");
				email = JOptionPane.showInputDialog("Digite o email: ");
				listaContatos.add(new Contato(nome, tel, cel, email));
				break;
			case 2:
				for (int i=0; i < listaContatos.size();i++) {
					Contato contato = listaContatos.get(i);
					JOptionPane.showMessageDialog(null, "Contato "+ (i+1) + "\nNome: " + contato.getNome() + "\nTelefone: " + contato.getTelefone() + "\nCelular: " + contato.getCelular() + "\nEmail: " + contato.getEmail());
					//System.out.println(contato.getNome() + "   " + contato.getTelefone() + "   " + contato.getCelular() + "   " + contato.getEmail());
					}
				break;
			}
			
			menu = Integer.parseInt(JOptionPane.showInputDialog("****************************************\n                           Menu\n 1. Inserir Contato\n 2. Listar Contatos\n3.Sair\n ****************************************\n"));
		} while (menu !=3);
		
	
		
	}

}
