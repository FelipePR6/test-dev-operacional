package br.com.felipe.testdevoperacional.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "produtos")
@Entity(name = "Produto")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotNull
	private String nome;
	@NotNull
	private Integer quantidade;
	@NotNull
	private Double preco;
	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;

	public Produto(Long id,String nome, Integer quantidade, Double preco, Empresa empresa) {
		super();
		this.id = id;
		this.nome = nome;
		this.quantidade = quantidade;
		this.preco = preco;
		this.empresa = empresa;
	}

	public Produto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
