package AvaInter1_ArthurJS;

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;

import alunoAvaInter1.Aluno;
import escolaAvaInter1.Escola;

public class AppAvaInter1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		String nome, telefone;
        double mensalidade;
        double [] notas = new double[5];
        boolean valida;
        int op, op1;
    
        do {
        	nome = JOptionPane.showInputDialog(null, "Nome: ", "Nome Completo", 1);
	        valida = Validacao.validaNome(nome);
        }
        while(valida == false);
        
        telefone = JOptionPane.showInputDialog(null, "Telefone: ", "Telefone" , 1);
        
        for(int i = 0; i <= notas.length-1; i++) {
        	String input = JOptionPane.showInputDialog(null, "Notas: ", "Notas" , 1);
            notas[i] = Double.parseDouble(input);
        }
        
        String input1 = JOptionPane.showInputDialog(null, "Mensalidade: ", "Mensalidade" , 1);        
        mensalidade = Double.parseDouble(input1);
        
		Aluno aluno = new Aluno(nome, telefone, notas, mensalidade);

		do {
			op = Integer.parseInt(JOptionPane.showInputDialog(null, "                          Menu\n1) Imprimir Dados do Aluno\n2) Imprimir Média do Aluno\n3) Imprimir Total a Pagar\n4) Alterar Dados do Aluno\n5) SAIR", "Menu", 1));
			
			switch(op) {
			case 1 : 							
						JOptionPane.showMessageDialog(null,  "Código do aluno: " + aluno.getCodigo(),"Código Aluno", 1);
						JOptionPane.showMessageDialog(null,  Aluno.imprimeNome(nome),"Resultado", 1);
						JOptionPane.showMessageDialog(null,  "Telefone: " + aluno.getTelefone(),"Telefone", 1);
						for(int i=0;i<notas.length;i++) {
							JOptionPane.showMessageDialog(null,  "Nota: " + aluno.getNotas()[i],"Nota", 1);
						}
						JOptionPane.showMessageDialog(null,  "Mensalidade: " + aluno.getMensalidade(),"Mensalidade", 1);
						break;
						
			case 2 : 													
						JOptionPane.showMessageDialog(null,  "Média: " + Aluno.calcularMedia(notas),"Média das Notas", 1);
						break;
						
			case 3 : 													
						JOptionPane.showMessageDialog(null,  "Total a pagar: " + Escola.calcularTotalAPagar(mensalidade) ,"Total a pagar", 1);
						break;
			
			case 4 : 													
						do {
							op1 = Integer.parseInt(JOptionPane.showInputDialog(null, "                   Alterar Dados\n1) Alterar Telefone\n2) Alterar Notas\n3) Alterar Mensalidade\n4) SAIR" , "Secretaria" , 1));
							
							switch(op1) {
							case 1 : 
										String input3 = JOptionPane.showInputDialog(null, "Telefone: ", "Alterar Telefone" , 1);
										aluno.setTelefone(input3);
										JOptionPane.showMessageDialog(null,  "Telefone alterado com sucesso!","Alteração", 1);
										break;
										
							case 2 : 		
										for(int i=0;i<notas.length;i++) {											
											double input4 = Double.parseDouble(JOptionPane.showInputDialog(null, "Nota: ", "Alterar Notas" , 1));											
											notas[i] = input4;
											aluno.setNotas(notas);
										}		
										JOptionPane.showMessageDialog(null,  "Notas alteradas com sucesso!","Alteração Notas", 1);
										break;
										
							case 3 : 	
										input1 = JOptionPane.showInputDialog(null, "Mensalidade: " , "Alterar Mensalidade" , 1);
										mensalidade = Double.parseDouble(input1);
										aluno.setMensalidade(mensalidade);
										JOptionPane.showMessageDialog(null,  "Mensalidade alterada com sucesso! ","Alteração Mensalidade", 1);
										break;																			
							}
							
						} while(op1 != 4);
				break;
			}
		} while(op != 5);		
    }
}
