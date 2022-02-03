package Associacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Scanner scString = new Scanner(System.in);	
		char resp;		
		Pessoa p = new Pessoa();
		Endereco end = new Endereco();
		
		System.out.println("Digite o nome: ");
		p.setNome(scString.nextLine());
		System.out.println("Digite o idade: ");
		p.setIdade(sc.nextInt());
		System.out.println("Digite o sexo (f/m): ");
		p.setSexo(sc.next().charAt(0));
		
		System.out.println("Digite seu endereco: ");
		end.setLogradouro(scString.nextLine());
		System.out.println("Digite o numero: ");
		end.setNumero(sc.nextInt());
		System.out.println("Tem complemento?");
		resp = sc.next().charAt(0);
		if(resp == 's') {
			System.out.println("Digite o complemento");
			end.setComplemento(scString.nextLine());
		}else {
			end.setComplemento(" ");
		}
		System.out.println("Digite o CEP: ");
		end.setCep(scString.nextLine());
		
		p.setEnd(end);
		
		System.out.println("Dados da " + p.getNome() + "\n" + p.imprimir());
	}

}
