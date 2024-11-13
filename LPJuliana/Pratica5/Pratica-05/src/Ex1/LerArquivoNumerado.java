package Ex1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivoNumerado {
    public static void main(String[] args) {
        // Nome do arquivo que será lido
        String nomeArquivo = "arquivo.java";  // Substitua pelo caminho correto do seu arquivo

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            int numeroLinha = 1;

            // Ler o arquivo linha por linha
            while ((linha = leitor.readLine()) != null) {
                // Exibir a linha numerada
                System.out.println(numeroLinha + ": " + linha);
                numeroLinha++;
            }
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
