package avaInter2_ArthurJosedosSantos;

//import java.util.HashMap;

public class Remedio {
	private String nome, laboratorio, unidade;
	
	public Remedio() {

	}

	public Remedio(String nome, String laboratorio, String unidade) {
		this.nome = nome;
		this.laboratorio = laboratorio;
		this.unidade = unidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getUnidade() {
		return unidade;
	}

	public void setUnidade(String unidade) {
		this.unidade = unidade;
	}
	
//	public static String Unidade(String unidade) {
//		HashMap<String, String> unidadesdemedidas = new HashMap<>();
//		unidadesdemedidas.put("ml","mililitro");
//		unidadesdemedidas.put("cp","comprimido");
//		unidadesdemedidas.put("gr","grama");
//		unidadesdemedidas.put("un","unidade");
//		return unidadesdemedidas.get(unidade);
//	}
}
