package metodoinstancia;

public class MetodoInstancia {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.primeiroNome = "Adriano";
        cliente.ultimoNome = "Crosoletto";
        cliente.telefone = "939329321";
        cliente.eMail = "adrianocrosoletto@gmail.com";


        Cliente cliente2 = new Cliente();

        cliente2.primeiroNome = "Tamara";
        cliente2.ultimoNome = "Correa";
        cliente2.telefone = "11";
        cliente2.eMail = "tamara.correa@gmail.com";


        System.out.println("Nome do cliente " + cliente.obterNomeCompleto());
        System.out.println("Nome do cliente " + cliente2.obterNomeCompleto());

    }

    /*static String obterNomeCompletoCliente(Cliente cliente){
        String nomeCompleto = cliente.primeiroNome + " " + cliente.ultimoNome;
        return nomeCompleto;
    }*/
}
