package Ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscreverArquivo {
    public static void main(String[] args) {
        // Nome do arquivo
        String nomeDoArquivo = "dados.txt";

        try {
            // Cria um FileWriter e um PrintWriter para escrever no arquivo
            FileWriter fileWriter = new FileWriter(nomeDoArquivo);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            // Escreve os números de 1 a 100, cada um em uma nova linha
            for (int i = 1; i <= 100; i++) {
                printWriter.println(i);
            }

            // Fecha o PrintWriter para salvar o conteúdo
            printWriter.close();
            System.out.println("Arquivo criado com sucesso!");

        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao escrever no arquivo.");
            e.printStackTrace();
        }
    }
}

