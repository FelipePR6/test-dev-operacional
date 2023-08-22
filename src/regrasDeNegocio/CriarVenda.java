package regrasDeNegocio;

import model.Cliente;
import model.Empresa;
import model.Produto;
import model.Venda;

import java.math.BigDecimal;
import java.util.List;

public class CriarVenda {

    public static Venda criaVenda(List<Produto> carrinho, Empresa empresa, Cliente cliente, List<Venda> vendas) {
        Double total = carrinho.stream().mapToDouble(Produto::getPreco).sum();
        Double comissaoSistema = total * empresa.getTaxa();
        int idVenda = vendas.isEmpty() ? 1 : vendas.get(vendas.size() - 1).getCodigo() + 1;
        Venda venda = new Venda(idVenda, carrinho.stream().toList(), BigDecimal.valueOf(total), BigDecimal.valueOf(comissaoSistema), empresa, cliente);
        empresa.setSaldo(empresa.getSaldo().add(BigDecimal.valueOf(total - comissaoSistema)));
        vendas.add(venda);
        return venda;
    }

}
