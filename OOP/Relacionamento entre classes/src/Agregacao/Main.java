package Agregacao;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Telefone t = new Telefone();
		Acessorios ac = new Acessorios();
		char resp;
		System.out.println("Qual a marca: ");
		t.setMarca(sc.next());
		System.out.println("Qual o modelo: ");
		t.setModelo(sc.next());
		System.out.println("Qual o preco: ");
		t.setPreco(sc.nextDouble());
		System.out.println("Deseja acessorio (s/n): ");
		resp = sc.next().charAt(0);
		if(resp == 's' || resp == 'S') {
			System.out.println("Tipo de acessorio: ");
			ac.setTipo_acessorio(sc.next());
			System.out.println("Preco do acessorio: ");
			ac.setPreco_aces(sc.nextDouble());
			System.out.println("Quantidade do acessorio: ");
			ac.setQtd(sc.nextInt());
		}else {
			ac.setTipo_acessorio("");
			ac.setPreco_aces(0.00);
			ac.setQtd(0);
		}
		t.setAces(ac);
		System.out.println("DADOS DA COMPRA\n" + t.imprime());
	}
}
