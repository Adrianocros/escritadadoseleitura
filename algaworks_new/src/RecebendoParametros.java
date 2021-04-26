import java.util.Scanner;

public class RecebendoParametros {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        imprimirTraco();

        String[] curso = new String[]{"Java OO Básico", "Spring", "Java OO Avançado"};

        System.out.println("Escolha um curso abaixo");

       iterarExibePosicaoString(curso);

        System.out.print("O curso escolhido é o : ");

        Integer posicaoCursoEscolhido = scanner.nextInt();
        Boolean posicaoValida = posicaoCursoEscolhido >= 0 && posicaoCursoEscolhido < curso.length;
        if (!posicaoValida) {
            posicaoInvalida();
        }
        imprimirTraco();

        String[] formaDePagamento = new String[]{"Boleto", "Cartão"};

        System.out.println("Escolha uma forma de pagamento ");

        iterarExibePosicaoString(formaDePagamento);

        System.out.print("Sua forma de pagamento escolhida foi ");

        Integer posicaoFormaDePagamento = scanner.nextInt();
        posicaoValida = posicaoFormaDePagamento >= 0 && posicaoCursoEscolhido < formaDePagamento.length;
        if (!posicaoValida) {
            posicaoInvalida();
        }
        String cursoEscolhido = curso[posicaoCursoEscolhido];
        String formaDePagamentoEscolhifo = formaDePagamento[posicaoFormaDePagamento];
        imprimirTraco();
        System.out.println("O curso escolhido foi " + cursoEscolhido + " e a forma de pagamento escolhido foi " + formaDePagamentoEscolhifo);
        scanner.close();

    }

    //Refatorando o codigo.

    static void imprimirTraco() {
        System.out.println("######################################################");
    }
    static void posicaoInvalida() {
        System.out.println("Posicao invalida !");
        System.exit(1);
    }
    static  void iterarExibePosicaoString(String[] vetor){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println( + i + "." + vetor[i]);
        }
    }

}
