package regrasDeNegocio.regrasEmpresas;

import model.*;

import java.util.List;

public class VendasEfetuadas {

    public static void exibirVendas(Empresa empresaLogada, List<Venda> vendas){
        System.out.println();
        System.out.println("************************************************************");
        System.out.println("VENDAS EFETUADAS");
        vendas.stream().forEach(venda -> {
            if (venda.getEmpresa().getId().equals(empresaLogada.getId())) {
                System.out.println("************************************************************");
                System.out.println("domain.Venda de código: " + venda.getCodigo() + " no CPF "
                        + venda.getCliente().getCpf() + ": ");
                venda.getItens().stream().forEach(x -> {
                    System.out.println(x.getId() + " - " + x.getNome() + "    R$" + x.getPreco());
                });
                System.out.println("Total domain.Venda: R$" + venda.getValor());
                System.out.println("Total Taxa a ser paga: R$" + venda.getComissaoSistema());
                System.out.println("Total Líquido  para empresa: R$"
                        + (venda.getValor().subtract(venda.getComissaoSistema())
                ));
                System.out.println("************************************************************");
            }

        });
        System.out.println("Saldo da empresa: " + empresaLogada.getSaldo());
        System.out.println("************************************************************");
    }
}
