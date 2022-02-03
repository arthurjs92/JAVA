/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaInter2_SolangeBrasileiroDeFreitasNeto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Solange
 */
public class AppAvaInter2 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome, laboratorio, unidade;
        String variedade;
        int variedade2 = 0, count;

        HashMap<String, String> unidadesDeMedidas = new HashMap<>();
        unidadesDeMedidas.put("ml", "mililitro");
        unidadesDeMedidas.put("cp", "comprimido");
        unidadesDeMedidas.put("gr", "grama");
        unidadesDeMedidas.put("un", "unidade");

        ArrayList<Remedio> listaRemedios = new ArrayList<Remedio>();

        System.out.println("Qual é a variedade de remédios?");
        variedade = sc.nextLine();
        variedade2 = Integer.parseInt(variedade);

        for (int i = 0; i < variedade2; i++) {
            System.out.println("Qual é o nome do remédio?");
            nome = sc.nextLine();
            System.out.println("Qual é o laboratorio do remédio?");
            laboratorio = sc.nextLine();

            do {
                System.out.println("Qual a unidade do remédio?");
                unidade = sc.nextLine();
                count = 0;

                if (unidade.length() != 2) {
                    System.out.println("O atributo unidade deve ter exatamente 2 caracteres!");
                } else {
                    listaRemedios.add(new Remedio(nome, laboratorio, unidade));
                    count = 2;
                }

            } while (count != 2);
        }

        System.out.println("Qual é o nome do Animal?");
        String nomeAnimal = sc.nextLine();
        System.out.println("Quais são as observacões?");
        String observacoes = sc.nextLine();
        System.out.println("Qual é a queixa?");
        String queixa = sc.nextLine();
        System.out.println("Qual é o historico?");
        String historico = sc.nextLine();

        Consulta consulta = new Consulta(nomeAnimal, observacoes, queixa, historico);

        for (int i = 0; i < listaRemedios.size(); i++) {
            Remedio remedio = listaRemedios.get(i);
            System.out.println("(" + (i + 1) + ") : " + remedio.getNome() + " - " + remedio.getLaboratorio());
        }

        System.out.println("Digite o número do remedio de sua escolha!");
        int opcao = sc.nextInt();

        Remedio remedio = listaRemedios.get(opcao - 1);

        System.out.println("Digite a dose do Remedio!");
        double dose = sc.nextDouble();

        System.out.println("Digite a duração do Remedio!");
        int duracao = sc.nextInt();

        ItemReceita receita = new ItemReceita(dose, duracao, remedio);

        ArrayList<ItemReceita> itens = new ArrayList<>();
        itens.add(receita);
        consulta.setItens(itens);

        
        System.out.println(consulta.getItens().get(0).getRemedio().getNome() + " - " + consulta.getItens().get(0).getRemedio().getLaboratorio() + " - " + consulta.getItens().get(0).getDose() + " " + unidadesDeMedidas.get(consulta.getItens().get(0).getRemedio().getUnidade()) +" - " + consulta.getItens().get(0).getDuracao() + " dias ");
    }
}
