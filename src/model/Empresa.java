package model;

import java.math.BigDecimal;

public class Empresa extends Usuario {
	private Integer id;
	private String nome;
	private String cnpj;
	private Double taxa;
	private BigDecimal saldo;

	public Empresa() {
		super();
	}

	public Empresa(Integer id, String username, String senha, TiposDeUsuario tiposDeUsuario, String nome, String cnpj, Double taxa, BigDecimal saldo) {
		super(username, senha, tiposDeUsuario);
		this.id = id;
		this.nome = nome;
		this.cnpj = cnpj;
		this.taxa = taxa;
		this.saldo = saldo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public Double getTaxa() {
		return taxa;
	}

	public void setTaxa(Double taxa) {
		this.taxa = taxa;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

}
