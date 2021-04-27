/*
Criar um programa que calcule a média de salários de uma empresa, 
pedindo ao usuário a grade de funcionários e os salários, 
e devolvendo a média salarial. */


public class MediaSalario {
    public static void main(String[] args){
        double n1,n2,n3,n4,media;

        n1 = 4332.45;
        n2 = 3422.56;
        n3 = 1232.55;
        n4 = 3321.45;

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A media salarial da empresa é " + media);

    }
}
