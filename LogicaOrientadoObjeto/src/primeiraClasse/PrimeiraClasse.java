package primeiraClasse;

public class PrimeiraClasse {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.nome = "Smartphone";
        produto.preco = 500.0;
        produto.quantidade = 15;



        exibirQuantidadeEstoque(produto);

    }
    //Criação do objeto Produto
    static  void exibirQuantidadeEstoque(Produto produto){
        System.out.println("Produto : "+ produto.nome + ", quantidade em estoque : " + produto.quantidade);

    }

}
