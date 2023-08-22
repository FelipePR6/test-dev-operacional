package br.com.felipe.testdevoperacional.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.math.BigDecimal;

@Table(name = "empresas")
@Entity(name = "Empresa")
@PrimaryKeyJoinColumn(name = "usarioId")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Empresa extends Usuario {
	@NotNull
	private String nome;
	@NotNull
	private String cnpj;
	@NotNull
	private Double taxa;

	@Setter
	@NotNull
	private BigDecimal saldo;

	public Empresa() {
		super();
	}

	public Empresa(Long id, String username, String senha, TiposDeUsuario tiposDeUsuario, String nome, String cnpj, Double taxa, BigDecimal saldo) {
		super(username, senha, tiposDeUsuario);
		this.nome = nome;
		this.cnpj = cnpj;
		this.taxa = taxa;
		this.saldo = saldo;
	}

}
