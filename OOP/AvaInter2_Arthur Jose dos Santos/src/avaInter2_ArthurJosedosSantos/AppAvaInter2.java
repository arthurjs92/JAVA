package avaInter2_ArthurJosedosSantos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class AppAvaInter2 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		int cont=0, quantidade=0, i=0, op=0, duracao, qtdAdd=0, qtdAddCount = 0;
		String nome, laboratorio, unidade, nomeAnimal, observacoes, queixa, historico, resposta;
		double dose;
		
		HashMap<String, String> unidadesdemedidas = new HashMap<>();
		unidadesdemedidas.put("ml","mililitro");
		unidadesdemedidas.put("cp","comprimido");
		unidadesdemedidas.put("gr","grama");
		unidadesdemedidas.put("un","unidade");
		
			quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantos serao inseridos remedios?"));
			
			ArrayList<Remedio> listadeRemedios = new ArrayList<>();
			
			do {
				 nome = JOptionPane.showInputDialog("Digite o nome do remedio: ");
				 laboratorio = JOptionPane.showInputDialog("Digite o nome do laboratorio: ");
				 unidade = JOptionPane.showInputDialog("Digite a unidade: ");
				if(unidade.length()>2) {
					while(unidade.length()>2) {
						unidade = JOptionPane.showInputDialog("Digite o nome do remedio: ");
					}
				}
				listadeRemedios.add(new Remedio(nome, laboratorio, unidade));
				cont+=1;
			}while(quantidade != cont);
			
			nomeAnimal = JOptionPane.showInputDialog("Nome do animal: ");		
			observacoes = JOptionPane.showInputDialog("Observacoes: ");
			queixa = JOptionPane.showInputDialog("Qual a queixa: ");
			historico = JOptionPane.showInputDialog("Historico: ");
			
			Consulta c = new Consulta(nomeAnimal,observacoes,queixa,historico);
			
//			for(i=0;i<listadeRemedios.size();i++) {
//				Remedio remedio = listadeRemedios.get(i);
//				JOptionPane.showMessageDialog(null, "("+(i+1)+")" + " : "+remedio.getNome()+" - " + remedio.getLaboratorio());
//			}
			
			for(Remedio remedio : listadeRemedios) {
				JOptionPane.showMessageDialog(null, "("+(i+1)+")" + " : "+remedio.getNome()+" - " + remedio.getLaboratorio());
				i++;
			}
			
			ArrayList<ItemReceita> itens = new ArrayList<>();
			
			qtdAdd = Integer.parseInt(JOptionPane.showInputDialog("Quantos remedios deseja adicionar consulta?"));
			
			do {
					op = Integer.parseInt(JOptionPane.showInputDialog("Digite a opcao do remedio que sera adicionado: "));
					Remedio remedioEscolhido = listadeRemedios.get(op-1);
					
					dose = Double.parseDouble(JOptionPane.showInputDialog("Qual a dose recomendada: "));
					
					duracao = Integer.parseInt(JOptionPane.showInputDialog("Qual a duracao: "));
					
//					3.2.5 O programa dever? criar um objeto da classe ItemReceita(dose,
//							duracao, remedio). O atributo remedio contido nesta classe ir? referenciar o
//							objeto remedio que foi selecionado pelo usu?rio no main( ), conforme
//							mostrado no item 3.2.3.
					ItemReceita ir = new ItemReceita(dose, duracao, remedioEscolhido);

			        itens.add(ir);	
			        qtdAddCount++;
			}while(qtdAdd != qtdAddCount);
			
	        c.setItens(itens);
        
//			3.3 - O programa dever? listar os rem?dios inseridos na Consulta. Para cada
//			rem?dio inserido, apresentar os seguintes dados: nome do rem?dio, laborat?rio do
//			rem?dio, dose + (unidade de medida - descri??o), dura??o (dias).

//			obs.: A descri??o da unidade de medida ser? obtida atrav?s da cole??o (Mapa)
//			criada na ETAPA 1
			
			for(i=0;i<itens.size();i++) {
				JOptionPane.showMessageDialog(null, c.getItens().get(i).getRemedio().getNome() 
						+ " - " 
						+ c.getItens().get(i).getRemedio().getLaboratorio() 
						+ " - " 
						+ c.getItens().get(i).getDose() 
						+ " " 
						+ unidadesdemedidas.get(c.getItens().get(i).getRemedio().getUnidade()) 
						+" - " 
						+ c.getItens().get(i).getDuracao() 
						+ " dias ");
			}
			
//			for(ItemReceita ItemReceita : itens) {
//				JOptionPane.showMessageDialog(null, c.getItens().get(j).getRemedio().getNome() 
//						+ " - " 
//						+ c.getItens().get(j).getRemedio().getLaboratorio() 
//						+ " - " 
//						+ c.getItens().get(j).getDose() 
//						+ " " 
//						+ unidadesdemedidas.get(c.getItens().get(j).getRemedio().getUnidade()) 
//						+" - " 
//						+ c.getItens().get(j).getDuracao() 
//						+ " dias ");
//			}
	}
}
