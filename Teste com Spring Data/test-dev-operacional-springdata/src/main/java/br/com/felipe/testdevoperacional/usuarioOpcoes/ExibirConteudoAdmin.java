package br.com.felipe.testdevoperacional.usuarioOpcoes;

import br.com.felipe.testdevoperacional.model.*;
import br.com.felipe.testdevoperacional.regrasDeNegocio.regrasEmpresas.ProdutosDaEmpresa;
import br.com.felipe.testdevoperacional.regrasDeNegocio.regrasEmpresas.VendasEfetuadas;

import java.util.List;

public class ExibirConteudoAdmin {

    public static void exibirTodasAsVendas(List<Empresa> empresas, List<Venda> vendas){
        for (Empresa empresa:
                empresas) {
            System.out.println("************************************************************\n");
            System.out.println(empresa.getNome());
            System.out.println("\n************************************************************");
            VendasEfetuadas.exibirVendas(empresa, vendas);
        }
    }

    public static void exibirTodosOsProdutos(List<Empresa> empresas, List<Produto> produtos){
        for (Empresa empresa:
                empresas) {
            System.out.println("************************************************************\n");
            System.out.println(empresa.getNome());
            ProdutosDaEmpresa.exibirProdutos(empresa, produtos);
        }
    }

}
