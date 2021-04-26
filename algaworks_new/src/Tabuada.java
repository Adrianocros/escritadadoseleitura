import java.util.Scanner;

public class Tabuada {

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a tabuada que deseja : ");
        Integer numero = scanner.nextInt();

        System.out.println("----------------------------------");

        imprimeTabuada(numero, 0);

        scanner.close();

    }

    static  void imprimeTabuada(Integer multiplicando, Integer multiplicador){
        System.out.println(multiplicando + " x " + multiplicador + " = " + (multiplicando * multiplicador));

        if(++multiplicador <= 10){
            imprimeTabuada(multiplicando, multiplicador);
        }
    }

}
