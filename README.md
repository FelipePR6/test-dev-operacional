<h1 align="center"> Teste para vaga Desenvolvedor Júnior em Java</h1>


Em um teste para a vaga Java Júnior uma empresa passou um sistema problemático e pediu para listar todos os problemas encontrados e depois colocar em um repositório uma versão do projeto com suas soluções implementadas em um tempo limite. </br>
Detalhe importante que os problemas deveriam ter a seguinte lista de prioridades : Regras de negócio, Código, Boas Práticas, Estrutura de dados e Experiência de Usuário. </br>
Neste README contém a lista de erros encontrados e o repositório apresenta justamente o projeto. </br>
Uma observação importante é que na pasta <code>.\Teste com Spring Data</code> se encontra o esqueleto de outro projeto tentando resolver os problemas de Estrutura de dados com Spring FrameWork, porém este não teve tempo de finalizá-lo. Logo mantenho apenas uma pasta com sua existência para mostrar até onde foi feito. </br>

<h2 align="center"> Problemas encontrados</h2>

<h3> Erros de regra de negócio</h3>
<strong>1. Regra infligida:</strong> Além do administrador e da própria empresa, nenhum outro usuário poderá ver informações da empresa (além do nome).</br>
<strong>Erro(s) encontrado(s):</strong> Na hora de listar as empresas para o usuário fazer uma compra o programa lista também o ID.</br>
Também se nota que a conta Admin tem visibilidade de um simples cliente.</br>
</br>
<strong>2. Regra infligida:</strong> O saldo da empresa deve ser alterado já refletindo as taxas.</br>
<strong>Erro(s) encontrado(s):</strong> Quando uma compra é feita se é somado sem taxas na variável saldo de um objeto da classe <em>Empresa</em>.</br>
</br>
<strong>3. Regra infligida:</strong> A empresa deve vender apenas produtos que ela esteja relacionada.</br>
<strong>Erro(s) encontrado(s):</strong> Uma empresa pode vender itens de todas as outras empresas.</br>

<h3> Erros de Código</h3>
Toda vez que a palavra “código” é escrita na classe <em>Venda</em> elas contêm acento. Não se deve usar acentos para a escrita de um código.</br>
</br>
Se você como cliente escolher fazer uma compra em uma empresa que não existe, o código acusa um erro de <em>IndexOutOfbounds</em> no final da compra.</br>
</br>
Se você como admin tentar fazer uma compra o código acusa um erro de <em>IndexOutOfbounds</em> no final da compra.</br>
</br>
Tanto a classe <em>Produto</em> quanto a classe <em>Venda</em> tem construtores padrão nunca utilizados.</br>
</br>
Se você realizar login tanto como empresa ou cliente e pedir a opção 1 (Fazer compra ou listar vendas) e finalizar esse procedimento e então logo em seguida errar o usuário colocando um valor numérico e logo depois colocar na senha outro valor numérico será exibido valores sensíveis. Isso se dá devido a maneira que se lê inputs juntamente com a maneira que o programa faz seu loop puxando sempre a mesma função.</br>
</br>
O sistema registra uma compra vazia.</br>

<h3> Erros de Boas Práticas</h3>
O código apresenta inúmeros erros de boas práticas de programação, mas o seu principal problema é sua classe <em>Main</em> conter todas suas regras de negócio. Em programação devemos sempre buscar pelo princípio de responsabilidade única e isolar diferentes funções em diferentes classes.</br>
</br>
O ideal seria separar o projeto em diferente <em>packages</em>, isolando os domínios de suas regras de negócio e também o tratamento de informações de entrada. Sendo o domínio onde tem cada item que representaria uma entidade em um banco de dados.</br>
</br>
O código também não apresenta testes unitários para checar automaticamente as possibilidades de erros como também não usa nenhuma estrutura como <em>Maven</em> ou <em>Gradle</em> para organizar as pastas de teste ou a importação de dependências.</br>
</br>
Normalmente quando lidamos com dinheiro usamos a classe <em>BigDecimal</em> e não <em>Double</em>.</br>
</br>
É uma boa prática a utilização de <em>Enums</em> para deixar o código mais legível e seria recomendável sua utilização nos switches do arquivo <em>Main</em>.</br>
</br>
A classe <em>Usuário</em> deveria ser uma herança para as classes <em>Cliente</em> e <em>Empresa</em> já que ela contém código que ambas as classes reaproveitam e apenas conter um <em>Enum</em> explicitando a qual delas pertencem.</br>

<h3> Erros de Estrutura de dados</h3>
Não há verificação para conferir se os valores de ID são repetidos assim como não há verificação em relação a nulidade de valores importantes para o funcionamento das classes.</br>
</br>
Não há persistência em nossa estrutura de dados. Por consequência não há rollbacks e nem cenários de testes que utilizam um banco de dados próprio para não interferir nos negócios.</br>
</br>
Se usa Equals em alguns objetos não utilizando os IDs.</br>

<h3> Erros em Experiência de usuário </h3>
Para cada ação feita o usuário precisa fazer login novamente.</br>
</br>
A separação de linhas e ações em algumas funções tornam a usabilidade mais confusa.



