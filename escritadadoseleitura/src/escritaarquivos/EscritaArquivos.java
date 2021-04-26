package escritaarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class EscritaArquivos {
    public static void main(String[] args) throws IOException {
        //parametro 1 -> caminho do arquivo salvo.
        //parametro 2 -> array de strings uma linha do arquivo
        //parametro 3 ->
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linhas = new ArrayList<String>();
        System.out.println("Digite cinco teste para ser gravado...");
        for(int i=0; i < 5; i++){

            System.out.print("Nome " + i + " : ");
            String nome = scanner.nextLine();
             linhas.add(nome);
        }
        Path arquivos = Paths.get("E:\\Java\\ArquivoImport\\conteudoum.txt");
        Files.write(arquivos, linhas);
        System.out.println("Nomes gravados.....");

    }
}
