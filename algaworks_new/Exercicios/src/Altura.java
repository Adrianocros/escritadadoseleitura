import java.util.Scanner;

/*Tem-se um conjunto de dados contendo a altura e o sexo 
(masculino, feminino) de 10 pessoas. 
Fazer um algoritmo que calcule e escreva:
a. a maior e a menor altura do grupo;
b. média de altura dos homens;
c. o número de mulheres. */

public class Altura {
    public static void main(String[] args) {
        int sexo, qtMulheres = 0, qtHomens = 0;
        float altura, somaH = 0, mediaHomens = 0, maior = 0, menor = 0;
        
        Scanner entrada = new Scanner(System.in);

        for(int i=0; i<10; i++){
            System.out.println("Digite seu sexo (1-H, 2 M)");
            sexo= entrada.nextInt();
            System.out.println("Digite sua altura: ");
            altura = entrada.nextFloat();

            if(sexo == 1){
                qtMulheres++;
            }else if (sexo == 2){
                qtHomens++;
                somaH = somaH + altura;
            }else{
                System.out.println("Opção invalida");
            }

            if(altura > maior){
                maior = altura;
            }else if(altura < menor){
                menor = altura;
            }
        }
        mediaHomens = somaH / qtHomens;

        System.out.println("A maior altura do grupo é de " + maior + "m, e a menor é de " + menor + "m");
        System.out.println("A media de altura dos homens é " + mediaHomens + "m");
        System.out.println("O numero de mulheres é " + qtMulheres);

        entrada.close();
    }
}
