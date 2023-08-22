package br.com.felipe.testdevoperacional.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "clientes")
@Entity(name = "Cliente")
@PrimaryKeyJoinColumn(name = "usarioId")
@Getter
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cliente extends Usuario {
	@NotNull
	private String cpf;
	@NotNull
	private String nome;
	@NotNull
	private String username;
	@NotNull
	private Integer idade;

	public Cliente(String cpf, String username, String senha, TiposDeUsuario tiposDeUsuario, String nome, Integer idade) {
		super(username, senha, tiposDeUsuario);
		this.cpf = cpf;
		this.nome = nome;
		this.username = username;
		this.idade = idade;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}
