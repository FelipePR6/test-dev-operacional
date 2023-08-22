package br.com.felipe.testdevoperacional;

import br.com.felipe.testdevoperacional.usuarioOpcoes.EscolhasAdmin;
import br.com.felipe.testdevoperacional.usuarioOpcoes.EscolhasClientes;
import br.com.felipe.testdevoperacional.usuarioOpcoes.EscolhasEmpresa;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import br.com.felipe.testdevoperacional.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

@SpringBootApplication
public class TestDevOperacionalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestDevOperacionalApplication.class, args);

		var bancoDeDados = new SimularInsercaoNoBancoDeDados();
		bancoDeDados.gerarBancoDeDados();

		List<Venda> vendas = new ArrayList<Venda>();

		List<Usuario> usuarios = bancoDeDados.usuarios;
		List<Cliente> clientes = bancoDeDados.clientes;
		List<Empresa> empresas = bancoDeDados.empresas;
		List<Produto> produtos = bancoDeDados.produtos;
		executar(usuarios, clientes, empresas, produtos, vendas);
	}

	public static void executar(List<Usuario> usuarios, List<Cliente> clientes, List<Empresa> empresas,
								List<Produto> produtos, List<Venda> vendas) {
		Scanner sc = new Scanner(System.in);

		String nomeDeUsario = "";
		do {
			System.out.println("Entre com seu usuário e senha,\n" +
					"se quiser sair da página de login digite 0 como o nome de Usuário\n");
			System.out.print("Usuário: ");
			String username = sc.next();
			nomeDeUsario = username;
			System.out.print("Senha: ");
			String senha = sc.next();

			List<Usuario> usuariosSearch = usuarios.stream().filter(x -> x.getUsername().equals(username))
					.toList();
			if (!usuariosSearch.isEmpty()) {
				Usuario usuarioLogado = usuariosSearch.get(0);
				if ((usuarioLogado.getSenha().equals(senha))) {

					System.out.println("Escolha uma opção para iniciar");
					switch (usuarioLogado.getTiposDeUsuario()) {
						case EMPRESA: {
							EscolhasEmpresa.exibirEscolhasEmpresas(sc, (Empresa) usuarioLogado, vendas, produtos);
							break;
						}
						case CLIENTE: {
							EscolhasClientes.exibirEscolhasEmpresas(sc, usuarioLogado, clientes, empresas,
									produtos, vendas);
							break;
						}
						case ADMIN: {
							EscolhasAdmin.exibirEscolhasEmpresas(sc, empresas, vendas, produtos);
							break;
						}
					}

				} else
					System.out.println("Senha incorreta");
			} else {
				System.out.println("Usuário não encontrado");
			}
		} while(!Objects.equals(nomeDeUsario, "0"));
	}

}
