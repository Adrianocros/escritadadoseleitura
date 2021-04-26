package leituraarquivos;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class LeituraArquivos {
    public static void main(String[] args) throws IOException {
        //caminho para importar o arquivo
        Path arquivo = Paths.get("E:\\Java\\ArquivoImport\\conteudoum.txt");
        Files.readAllLines(arquivo);
        //Criando a lista do arquivo a ser importado
        List<String> linhas = Files.readAllLines(arquivo);

        for(int i=0; i<linhas.size();i++){
            String nome = linhas.get(i);

            //Escreve o arquivo na tela
            System.out.println("Nomes : " + nome);
        }
    }
}
