package model;

public class Usuario {
	private String email, senha;

	public Usuario(String entrada) {
		this.email = entrada.split(";")[0];
		this.senha = entrada.split(";")[1];
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}

