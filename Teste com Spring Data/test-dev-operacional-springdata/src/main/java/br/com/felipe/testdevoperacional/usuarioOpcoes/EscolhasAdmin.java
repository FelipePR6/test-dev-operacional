package br.com.felipe.testdevoperacional.usuarioOpcoes;


import br.com.felipe.testdevoperacional.model.*;

import java.util.List;
import java.util.Scanner;

public class EscolhasAdmin {
    public static void exibirEscolhasEmpresas(Scanner sc , List<Empresa> empresas, List<Venda> vendas, List<Produto> produtos){
        System.out.println("1 - Ver todas as Vendas Realizadas");
        System.out.println("2 - Ver todos os Produtos Registrados");
        System.out.println("0 - Deslogar");
        Integer escolha = sc.nextInt();
        switch (escolha) {
            case 1: {
                ExibirConteudoAdmin.exibirTodasAsVendas(empresas, vendas);
                break;
            }
            case 2: {
                ExibirConteudoAdmin.exibirTodosOsProdutos(empresas, produtos);
                break;
            }
            default:
                break;
        }
    }
}
