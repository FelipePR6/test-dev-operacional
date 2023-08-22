package br.com.felipe.testdevoperacional.regrasDeNegocio.regrasClientes;


import br.com.felipe.testdevoperacional.model.*;

import java.util.List;

public class ComprasEfetuadas {

    public static void exibirCompras(Usuario usuarioLogado, List<Venda> vendas){
        System.out.println();
        System.out.println("************************************************************");
        System.out.println("COMPRAS EFETUADAS");
        vendas.stream().forEach(venda -> {
            if (venda.getCliente().getUsername().equals(usuarioLogado.getUsername())) {
                System.out.println("************************************************************");
                System.out.println("Compra de código: " + venda.getCodigo() + " na empresa "
                        + venda.getEmpresa().getNome() + ": ");
                venda.getItens().stream().forEach(x -> {
                    System.out.println(x.getId() + " - " + x.getNome() + "    R$" + x.getPreco());
                });
                System.out.println("Total: R$" + venda.getValor());
                System.out.println("************************************************************");
            }

        });
    }
}
