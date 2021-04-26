public class RegraDeTres {

    public static void main(String[] args) {

        Double[] valorInicial = new Double[]{1000.0,100.0};
        Double proporcao = 10.0;

        Double resultadoFinal = regraDeTres(valorInicial, proporcao);

        System.out.println("O Resultado é " + resultadoFinal);

    }

    static  Double regraDeTres(Double[] premissa, Double proporcao){
        Double resultado =(premissa[0] * proporcao) / premissa[1];
        return resultado;
    }
}
