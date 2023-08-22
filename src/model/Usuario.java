package model;

public class Usuario {
	private String username;
	private String senha;
	private TiposDeUsuario tiposDeUsuario;

	public Usuario() {
		super();
	}

	public Usuario(String username, String senha, TiposDeUsuario tiposDeUsuario) {
		super();
		this.username = username;
		this.senha = senha;
		this.tiposDeUsuario = tiposDeUsuario;
	}

	public TiposDeUsuario getTiposDeUsuario(){
		return tiposDeUsuario;
	}
	public boolean IsAdmin() {
		return tiposDeUsuario == TiposDeUsuario.ADMIN;
	}

	public boolean IsEmpresa() {
		return tiposDeUsuario == TiposDeUsuario.EMPRESA;
	}

	public boolean IsCliente() {
		return tiposDeUsuario == TiposDeUsuario.CLIENTE;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
