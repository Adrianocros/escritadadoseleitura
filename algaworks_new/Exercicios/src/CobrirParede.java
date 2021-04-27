/**
 * Uma parede em formato retangular, cuja altura é hp (altura da parede) e 
 * a largura lp (largura da parede) precisa ser coberta por azulejos também 
 * retangulares. O azulejo retangular tem dimensões ha (altura do azulejo) 
 * e la (largura do azulejo). Escreva um programa que leia as quatro medidas 
 * hp, lp, ha e la, calcule e imprima quanto azulejos com as medidas dadas 
 * são necessários para cobrir a parede dada.
 * 
 * hp (altura da parede)
 * lp (largura da parede)
 * ha (altura do azulejo)
 * la (largura do azulejo)
 * qtd (Quantidade)
 * 
 */

public class CobrirParede {
  public static void main(String[] args){
      double hp, lp, la, ha,qtd;

      hp = 2.40;
      lp = 4.50;
      ha = 0.30;
      la = 0.30;

      qtd = (hp * lp) / (ha * la);

      System.out.println("A quantidade de azulejos necessarios é " + qtd);

  }  
}
