import model.*;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class SimularInsercaoNoBancoDeDados {

    public List<Usuario> usuarios;
    public List<Cliente> clientes;
    public List<Empresa> empresas;
    public List<Produto> produtos;

    public void gerarBancoDeDados(){
        Empresa empresa = new Empresa(2,"empresa", "1234", TiposDeUsuario.EMPRESA,
                "SafeWay Padaria", "30021423000159", 0.15, new BigDecimal(0));
        Empresa empresa2 = new Empresa(1,"empresa2", "1234", TiposDeUsuario.EMPRESA,
                "Level Varejo", "53239160000154", 0.05, new BigDecimal(0));
        Empresa empresa3 = new Empresa(3, "empresa3", "1234", TiposDeUsuario.EMPRESA,
                "SafeWay Restaurante", "41361511000116", 0.20, new BigDecimal(0));

        Produto produto = new Produto(1, "Pão Frances", 5, 3.50, empresa);
        Produto produto2 = new Produto(2, "Coturno", 10, 400.0, empresa2);
        Produto produto3 = new Produto(3, "Jaqueta Jeans", 15, 150.0, empresa2);
        Produto produto4 = new Produto(4, "Calça Sarja", 15, 150.0, empresa2);
        Produto produto5 = new Produto(5, "Prato feito - Frango", 10, 25.0, empresa3);
        Produto produto6 = new Produto(6, "Prato feito - Carne", 10, 25.0, empresa3);
        Produto produto7 = new Produto(7, "Suco Natural", 30, 10.0, empresa3);
        Produto produto8 = new Produto(8, "Sonho", 5, 8.50, empresa);
        Produto produto9 = new Produto(9, "Croissant", 7, 6.50, empresa);
        Produto produto10 = new Produto(10, "Ché Gelado", 4, 5.50, empresa);

        Cliente cliente = new Cliente("07221134049", "cliente", "1234", TiposDeUsuario.CLIENTE,
                "Allan da Silva", 20);
        Cliente cliente2 = new Cliente("72840700050", "cliente2", "1234", TiposDeUsuario.CLIENTE,
                "Samuel da Silva", 24);

        Usuario usuario1 = new Usuario("admin", "1234", TiposDeUsuario.ADMIN);


        usuarios = Arrays.asList(usuario1, empresa, cliente, cliente2, empresa2, empresa3);
        clientes = Arrays.asList(cliente, cliente2);
        empresas = Arrays.asList(empresa, empresa2, empresa3);
        produtos = Arrays.asList(produto, produto2, produto3, produto4, produto5, produto6, produto7,
                produto8, produto9, produto10);
    }

}
