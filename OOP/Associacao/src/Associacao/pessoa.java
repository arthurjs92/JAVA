package Associacao;

public class pessoa {
	
    private String nome;
    private int idade;
    private String CPF;
    private endereco residencial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public endereco getResidencial() {
        return residencial;
    }

    public void setResidencial(endereco residencial) {
        this.residencial = residencial;
    }
}
