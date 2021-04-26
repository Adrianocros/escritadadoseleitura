package classeEinstancia;

public class calsseEInstancia {
    public static void main(String[] args) {

        System.out.println("Qtd. minima estoque: " + Produto.quantidadeMinimaEstoque);

        Produto produto = new Produto();
        Produto.quantidadeMinimaEstoque = 11;
        produto.nome = "Caneca";
        System.out.println("Produto Um " + produto.nome + " Quantidade Um  -  " + Produto.quantidadeMinimaEstoque);


        Produto produto1 = new Produto();
        produto1.nome = "Caneca 2";
        System.out.println("Produto Dois : " + produto1.nome + " Quantidade Dois -  " + Produto.quantidadeMinimaEstoque );




    }

}
