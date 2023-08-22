package usuarioOpcoes;

import model.*;
import regrasDeNegocio.regrasClientes.ComprasEfetuadas;
import regrasDeNegocio.regrasClientes.RealizarCompra;

import java.util.List;
import java.util.Scanner;

public class EscolhasClientes {

    public static void exibirEscolhasEmpresas(Scanner sc , Usuario usuarioLogado, List<Cliente> clientes,
                                              List<Empresa> empresas, List<Produto> produtos, List<Venda> vendas){
        System.out.println("1 - Relizar Compras");
        System.out.println("2 - Ver Compras");
        System.out.println("0 - Deslogar");
        Integer escolha = sc.nextInt();
        switch (escolha) {
            case 1: {
                RealizarCompra.realizaCompra(sc, usuarioLogado, clientes, empresas,
                        produtos, vendas);
                break;
            }
            case 2: {
                ComprasEfetuadas.exibirCompras(usuarioLogado, vendas);
                break;
            }
            default:
                break;
        }
    }

}
