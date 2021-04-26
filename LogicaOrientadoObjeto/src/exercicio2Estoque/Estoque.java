package exercicio2Estoque;

public class Estoque {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "IPhone 5s";
        produto.quantidaEstoque = 6;

        System.out.println("Necessário repor estoque do produto " + produto.necessidadeDeReporEstoque());
    }

}
