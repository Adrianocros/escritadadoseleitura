package metodoinstancia;

public class Cliente {
    String primeiroNome;
    String ultimoNome;
    String telefone;
    String eMail;

        //Criando metodo de instancia.
        String obterNomeCompleto() {
            String nomeCompleto = primeiroNome + " " + ultimoNome;
            return nomeCompleto;
        }

}
