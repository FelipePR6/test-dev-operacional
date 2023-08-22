package br.com.felipe.testdevoperacional.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Table(name = "vendas")
@Entity(name = "Venda")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Venda {
	private Integer codigo;

	@ManyToMany
	private List<Produto> itens;
	private BigDecimal valor;
	private BigDecimal comissaoSistema;
	@ManyToOne
	@JoinColumn(name = "empresa_id")
	private Empresa empresa;
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	public Venda(Integer codigo, List<Produto> itens, BigDecimal valor, BigDecimal comissaoSistema, Empresa empresa, Cliente cliente) {
		super();
		this.codigo = codigo;
		this.itens = itens;
		this.valor = valor;
		this.comissaoSistema = comissaoSistema;
		this.empresa = empresa;
		this.cliente = cliente;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

}
