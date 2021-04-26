package encapsulamento;

public class Encapsulamento {
    public static void main(String[] args) {
        /*Cliente cliente = new Cliente();

        cliente.nome = "Adriano Crosoletto";
        cliente.telefone = "1134334332";

        System.out.println("Nome cliente " + cliente.nome);*/

        Cliente cliente = new Cliente();

        cliente.setNome("Adriano Bianchi");
        cliente.setTelefone("3423212212");

        System.out.println("Nome Completo " + cliente.getNome());
        System.out.println("Nome Primeiro  : "  + cliente.getPrimeiroNome());
        System.out.println("Nome Ultimo : " + cliente.getUltimoNome());
        System.out.println("Telefone cliente  : "  + cliente.getTelefone());


    }
}
