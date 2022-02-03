package Agregacao;
public class Telefone {
	private String modelo;
	private String marca;
	private Double preco;
	private Acessorios aces;
	public Telefone() {
		
	}
	
	public Telefone(String modelo, String marca, String data_fabricacao, Double preco, Acessorios aces) {
		this.modelo = modelo;
		this.marca = marca;
		this.aces = aces;
		this.preco = preco;
	}
	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public Double getMPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Acessorios getAces() {
		return aces;
	}

	public void setAces(Acessorios aces) {
		this.aces = aces;
	}
	
	public Double precoTotal() {
		Double somatudo = getMPreco() + aces.calculaAces();
		return somatudo;
	}
	
	public String imprime() {
		return "Modelo Celular: " + modelo + "\nMarca: " + marca + "\nPreco: " + preco + aces.imprimeAces() + "\nTotal: " +precoTotal();
	}
}
