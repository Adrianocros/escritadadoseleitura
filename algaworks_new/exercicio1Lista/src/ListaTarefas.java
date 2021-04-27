import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> linha = new ArrayList<>();
        System.out.println("Informa suas tarefas abaixo, para finalizar digite x ");


        //Inicio do programa onde informa as tarefaz;
        String tarefa;
        int i = 0;
        while (true){
            System.out.println("Tarefa : " + i + " : ");
            tarefa = scanner.nextLine();
            //linha onde para o programa.
            if("x".equals(tarefa)){
                break;
            }
            //linha onde passa a proxima linha
            linha.add(tarefa);
            i++;
        }
        //Local onde grava o arquivo
        escreverNoArquivo("E:\\Java\\ArquivoImport\\tarefa.txt",linha);

        scanner.close();
        //mensagem final
        System.out.println("Tarefa gravada.....");

    }

    static  void escreverNoArquivo(String arquivo, ArrayList<String>linhas) throws  IOException{
        Path path = Paths.get(arquivo);
        Files.write(path,linhas);
    }
}
