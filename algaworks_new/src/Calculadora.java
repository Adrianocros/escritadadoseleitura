import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double numeroEsquerda = informeNumero(scanner);

        imprimirTraco();

        Integer operacao = escolhaUmaOpcao(scanner);

        imprimirTraco();

        Double numeroDireita = informeNumero(scanner);

        imprimirTraco();

        Double resultado = realizaCalculo(operacao,numeroEsquerda,numeroDireita);

        System.out.println("O resultado é : " + resultado);

        scanner.close();
    }

    static  Double realizaCalculo(Integer operacao, Double numeroEsqueda, Double numeroDireita){
        Double resultado = null;

        switch (operacao){
            case 0: resultado = subtracao(numeroEsqueda,numeroDireita);
                break;
            case 1: resultado = adicao(numeroEsqueda,numeroDireita);
                break;
            case 3: resultado = multiplicacao(numeroEsqueda,numeroDireita);
                break;
            case 4: resultado = divisao(numeroEsqueda,numeroDireita);
                break;

            default:
                System.err.println("Escolha uma opcao valida !");
                System.exit(0);
        }

        return resultado;

    }

    static  Double subtracao(Double numeroEsqueda, Double numeroDireita){
        return numeroEsqueda - numeroDireita;
    }

    static  Double adicao (Double numeroEsqueda, Double numeroDireita ){
        return  numeroEsqueda + numeroDireita;
    }

    static  Double multiplicacao(Double numeroEsqueda, Double numeroDireita){
        return  (numeroEsqueda * numeroDireita);
    }

    static  Double divisao(Double numeroEsqueda, Double numeroDireita){
        return (numeroEsqueda / numeroDireita);
    }

    static  Integer escolhaUmaOpcao(Scanner scanner){
        System.out.println("Escolha uma opção");

        String[] operacao = new String[] {"Subtracao","Adicao","Multiplicacao","Divisao"};

        for(int i=0; i < operacao.length; i++){
            System.out.println( + i + "." + operacao[i]);
        }

        System.out.print("Digite a opção : ");

        return  scanner.nextInt();
    }

    static  Double informeNumero(Scanner scanner){
        System.out.print("Informe o numero: ");
        return  scanner.nextDouble();
    }

    static  void  imprimirTraco(){
        System.out.println("-----------------------------------");
    }


}
