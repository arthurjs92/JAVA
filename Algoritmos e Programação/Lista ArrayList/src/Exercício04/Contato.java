package Exercício04;

public class Contato {
	private String nome, tel, cel, email;
	
	public Contato (String nome, String tel, String cel, String email) {
		this.nome = nome;
		this.tel = tel;
		this.cel = cel;
		this.email = email;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome() {
		this.nome = nome;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel() {
		this.tel = tel;
	}
	
	public String getCel() {
		return cel;
	}
	
	public void setCel() {
		this.cel = cel;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail() {
		this.email = email;
	}
}
