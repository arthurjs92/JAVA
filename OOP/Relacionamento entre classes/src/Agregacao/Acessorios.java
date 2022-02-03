package Agregacao;
public class Acessorios {
	private String tipo_acessorio;
	private Double preco_aces;
	private int qtd;
	public Acessorios() {
		
	}
	public Acessorios(String tipo_acessorio, Double preco_aces, int qtd) {
		super();
		this.tipo_acessorio = tipo_acessorio;
		this.preco_aces = preco_aces;
		this.qtd = qtd;
	}
	public String getTipo_acessorio() {
		return tipo_acessorio;
	}

	public void setTipo_acessorio(String tipo_acessorio) {
		this.tipo_acessorio = tipo_acessorio;
	}

	public Double getPreco_aces() {
		return preco_aces;
	}

	public void setPreco_aces(Double preco_aces) {
		this.preco_aces = preco_aces;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

	public Double calculaAces() {
		Double soma = qtd * preco_aces;
		return soma;
	}
	
	public String imprimeAces() {
		return "\nAcessorio: " 
				+ tipo_acessorio 
				+ "\nPreco: " 
				+ preco_aces 
				+ "\nQuantidade: " 
				+ qtd;
	}
}
