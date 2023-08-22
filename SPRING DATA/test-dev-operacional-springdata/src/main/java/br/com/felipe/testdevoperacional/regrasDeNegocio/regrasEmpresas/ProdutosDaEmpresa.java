package br.com.felipe.testdevoperacional.regrasDeNegocio.regrasEmpresas;

import br.com.felipe.testdevoperacional.model.*;

import java.util.List;

public class ProdutosDaEmpresa {

    public static void exibirProdutos(Empresa empresaLogada, List<Produto> produtos){
        System.out.println();
        System.out.println("************************************************************");
        System.out.println("MEUS PRODUTOS");
        produtos.stream().forEach(produto -> {
            if (produto.getEmpresa().getId().equals(empresaLogada.getId())) {
                System.out.println("************************************************************");
                System.out.println("Código: " + produto.getId());
                System.out.println("Produto: " + produto.getNome());
                System.out.println("Quantidade em estoque: " + produto.getQuantidade());
                System.out.println("Valor: R$" + produto.getPreco());
                System.out.println("************************************************************");
            }

        });
        System.out.println("Saldo da Empresa: " + empresaLogada.getSaldo());
        System.out.println("************************************************************");
    }

}
