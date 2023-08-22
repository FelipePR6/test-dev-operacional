package br.com.felipe.testdevoperacional.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "usuarios")
@Entity(name = "Usuario")
@Inheritance(strategy = InheritanceType.JOINED)
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String username;
	private String senha;

	@Enumerated(EnumType.STRING)
	private TiposDeUsuario tiposDeUsuario;

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

	public void setUsername(String username) {
		this.username = username;
	}

}
