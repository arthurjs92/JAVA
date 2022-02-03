package avaInter2_ArthurJosedosSantos;

import java.util.ArrayList;

public class Consulta {
	private String nomeAnimal,observacoes, queixa, historico;
	private ArrayList<ItemReceita> itens;

	public Consulta() {

	}

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
