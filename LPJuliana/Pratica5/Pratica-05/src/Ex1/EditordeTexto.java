package Ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EditordeTexto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] texto = new String[50];  // Vetor para armazenar até 50 linhas
        int linhas = 0;

        System.out.println("Digite o texto linha por linha. Digite 'FIM' para finalizar.");

        // Ler linhas de texto até que o usuário digite "FIM" ou atinja 50 linhas
        while (linhas < 50) {
            String linha = scanner.nextLine();

            if (linha.equalsIgnoreCase("FIM")) {
                break;
            }

            texto[linhas] = linha;
            linhas++;
        }

        scanner.close();

        // Salvar o conteúdo em um arquivo de texto
        try (FileWriter writer = new FileWriter("texto_final.txt")) {
            for (int i = 0; i < linhas; i++) {
                writer.write(texto[i]);
                writer.write(System.lineSeparator());  // Adiciona uma nova linha
            }
            System.out.println("Texto salvo com sucesso no arquivo 'texto_final.txt'.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
