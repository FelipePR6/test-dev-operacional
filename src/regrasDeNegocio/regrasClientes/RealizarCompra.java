package regrasDeNegocio.regrasClientes;

import model.*;
import regrasDeNegocio.CriarVenda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RealizarCompra {

    public static void realizaCompra(Scanner sc, Usuario usuarioLogado, List<Cliente> clientes, List<Empresa> empresas,
                              List<Produto> produtos, List<Venda> vendas){

        System.out.println("Para realizar uma compra, escolha a empresa onde deseja comprar: ");
        for (int i = 0; i < empresas.size(); i++){
            System.out.println(i + 1 + " - " + empresas.get(i).getNome());
        }
        Integer escolhaEmpresaInt = sc.nextInt() -1;
        Integer escolhaProduto = -1;
        if(0 > escolhaEmpresaInt || escolhaEmpresaInt >= empresas.size()){
            System.out.println("Empresa informada não existe");
            return;
        }

        var carrinho = new ArrayList<Produto>();
        var empresaEscolhida = empresas.get(escolhaEmpresaInt);
        var itensDaEmpresa = produtos.stream().filter(p -> p.getEmpresa().equals(empresaEscolhida)).toList();

        do {
            System.out.println("Escolha os seus produtos: ");

            for (int i = 0; i < itensDaEmpresa.size(); i++){
                System.out.println(i + 1 + " - " + itensDaEmpresa.get(i).getNome());
            }
            System.out.println("0 - Finalizar compra");

            escolhaProduto = sc.nextInt() -1;
            if(0 > escolhaProduto || escolhaProduto >= itensDaEmpresa.size()){
                System.out.println("Produto informado não existe");
            } else{
                carrinho.add(itensDaEmpresa.get(escolhaProduto));
            }
            escolhaProduto++;
        } while (escolhaProduto != 0);

        if(carrinho.size() == 0){
            System.out.println("O carrinho de compras feita está vazio");
            return;
        }

        System.out.println("************************************************************");
        System.out.println("Resumo da compra: ");
        carrinho.stream().forEach(x -> {
            System.out.println(x.getNome() + "    R$" + x.getPreco());
        });

        Cliente clienteLogado = clientes.stream()
                .filter(x -> x.getUsername().equals(usuarioLogado.getUsername()))
                .findFirst().get();
        Venda venda = CriarVenda.criaVenda(carrinho, empresaEscolhida, clienteLogado, vendas);
        System.out.println("Total: R$" + venda.getValor());
        System.out.println("************************************************************");
        carrinho.clear();
    }

}
