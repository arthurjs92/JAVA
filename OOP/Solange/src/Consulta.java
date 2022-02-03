/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avaInter2_SolangeBrasileiroDeFreitasNeto;

import java.util.ArrayList;

/**
 *
 * @author Solange
 */
public class Consulta {

    private String nomeAnimal;
    private String observacoes;
    private String queixa;
    private String historico;
    private ArrayList<ItemReceita> itens;

    public Consulta(String nomeAnimal, String observacoes, String queixa, String historico) {
        this.nomeAnimal = nomeAnimal;
        this.observacoes = observacoes;
        this.queixa = queixa;
        this.historico = historico;
    }

    public Consulta(ArrayList<ItemReceita> itens) {
        this.itens = itens;
    }

    public String getNomeAnimal() {
        return nomeAnimal;
    }

    public void setNomeAnimal(String nomeAnimal) {
        this.nomeAnimal = nomeAnimal;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getQueixa() {
        return queixa;
    }

    public void setQueixa(String queixa) {
        this.queixa = queixa;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public ArrayList<ItemReceita> getItens() {
        return itens;
    }

    public void setItens(ArrayList<ItemReceita> itens) {
        this.itens = itens;
    }

}
