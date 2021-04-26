package exercicio2Estoque;

public class Produto {

    static final Integer QUANTIDADE_MINIMA_ESTOQUE = 10;

    String nome;
    Integer quantidaEstoque;

    Boolean necessidadeDeReporEstoque() {

        if (quantidaEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
             System.out.println("Há necessidade de repor o estoque " + quantidaEstoque);
        }else {
            System.out.println("Não ha necessidade de repor o estoque " + quantidaEstoque);
        }
        return null;
    }


}

