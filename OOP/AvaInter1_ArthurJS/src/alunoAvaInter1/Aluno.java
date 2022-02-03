package alunoAvaInter1;

import AvaInter1_ArthurJS.Auxiliar;

public class Aluno {
	private String nome, tel, codigo;
	private double [] notas;
	private double mensalidade;
	
	public Aluno (String nome, String tel, double[] notas, double mensalidade) {
		this.geraCodigo(nome);
		this.nome = nome;
		this.tel = tel;
		this.notas = notas;
		this.mensalidade = mensalidade;
	}
	public String getCodigo() {
		return codigo;
	}
	public String getNome() {
		return nome;
	}
	public String getTelefone() {
		return tel;
	}
	public double[] getNotas() {
		return notas;
	}
	public double getMensalidade() {
		return mensalidade;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setTelefone(String tel) {
		this.tel = tel;
	}
	public void setNotas(double[] notas) {
		this.notas = notas;
	}
	public void setMensalidade(double mensalidade) {
		this.mensalidade = mensalidade;
	}
	
	public void geraCodigo(String nome) {
        int tamanho = nome.length();
        String a = Integer.toString(tamanho);
        char[] aux = new char[3];
        String[] separa = nome.split(" ");
        char[] primeiro = separa[0].toCharArray();
        for(int i=0;i<primeiro.length;i++) {
            if(i<3) {
                char temp = primeiro[i]; 
                temp += 2;
                aux[i] = temp;
            }
        }
        String b = String.copyValueOf(aux);
        String altera = b+a;
        this.codigo = altera;
	}
	
	public static String imprimeNome(String nome){
		String [] separa = nome.split(" ");
		String fn = separa[0];
		String fa = fn.substring(0, 1);
		
		String fntd = "Aluno " + nome.toUpperCase() + " - " + separa[separa.length-1] + " " + fa + ".";
		return fntd;
	}
	
	public static double calcularMedia(double[] notas) {
		
		double soma = Auxiliar.somaValores(notas, 4);
		
		return soma/5;
	}
}
