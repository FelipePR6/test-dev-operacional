package br.com.felipe.testdevoperacional.usuarioOpcoes;

import br.com.felipe.testdevoperacional.model.*;
import br.com.felipe.testdevoperacional.regrasDeNegocio.regrasEmpresas.ProdutosDaEmpresa;
import br.com.felipe.testdevoperacional.regrasDeNegocio.regrasEmpresas.VendasEfetuadas;

import java.util.List;
import java.util.Scanner;

public class EscolhasEmpresa {

    public static void exibirEscolhasEmpresas(Scanner sc , Empresa empresaLogada, List<Venda> vendas, List<Produto> produtos){
        System.out.println("1 - Listar vendas");
        System.out.println("2 - Ver produtos");
        System.out.println("0 - Deslogar");
        Integer escolha = sc.nextInt();

        switch (escolha) {
            case 1: {
                VendasEfetuadas.exibirVendas(empresaLogada, vendas);
                break;
            }
            case 2: {
                ProdutosDaEmpresa.exibirProdutos(empresaLogada, produtos);
                break;
            }
            default:
                break;
        }
    }

}
