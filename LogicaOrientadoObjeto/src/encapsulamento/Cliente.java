package encapsulamento;

public class Cliente {

   // String nome;

    String primeiroNome;
    String ultimoNome;
    String telefone;

    //metodo para encapsulamento do nome.

    //alterando o get para não precisar altera no resto do programa
    public String getNome() {
        return primeiroNome + " " + ultimoNome;
    }

    //alterando o set para não precisar altera no resto do programa
    public void setNome(String nome) {
        String[] nomeCompleto = nome.split(" ");
        primeiroNome = nomeCompleto[0];
        ultimoNome = nomeCompleto[1];
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }

    public String getUltimoNome() {
        return ultimoNome;
    }

    public void setUltimoNome(String ultimoNome) {
        this.ultimoNome = ultimoNome;
    }
}
