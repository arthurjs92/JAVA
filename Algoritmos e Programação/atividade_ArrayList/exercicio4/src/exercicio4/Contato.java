package exercicio4;

public class Contato {
	private String nome, telefone, celular, email;
	
	public Contato (String nome, String telefone, String celular, String email) {
		this.nome = nome;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome() {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone() {
		this.telefone = telefone;
	}
	
	public String getCelular() {
		return celular;
	}
	
	public void setCelular() {
		this.celular = celular;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail() {
		this.email = email;
	}
}
