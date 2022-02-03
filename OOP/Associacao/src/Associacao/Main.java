package Associacao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o nome: ");
		String nome = sc.next();
		
		System.out.println("Digite o CPF: ");
		String cpf = sc.next();
		
		System.out.println("Digite a Idade: ");
		int idade = sc.nextInt();
		
		System.out.println("Digite a Cidade: ");
		String cidade = sc.next();
		
		System.out.println("Digite o CEP: ");
		int cep = sc.nextInt();
		
		pessoa n,c,i;
		endereco c1,cp;
		
		n = new pessoa();
        
        for(int i=0; i<vetor.length;i++){
            vetor[i]=new pessoa();
            vetor[i].setNome(nome);
            vetor[i].setCPF(cpf);
            vetor[i].setIdade(idade);

            // Declara e Cria um endereço
            endereco e;
            e = new endereco();
            e.setCidade(cidade);
            e.setCEP(cep);

            // Atribui o endereço à pessoa
            
            vetor[i].setResidencial(e);
        }
	}

}
