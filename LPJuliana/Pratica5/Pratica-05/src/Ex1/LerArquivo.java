package Ex1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerArquivo {

        public static void main(String[] args) {
            // Definir o nome do arquivo
            String nomeArquivo = "dados.txt";

            try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
                String linha;
                // Ler o arquivo linha por linha
                while ((linha = leitor.readLine()) != null) {
                    // Exibir cada número na tela
                    System.out.println(linha);
                }
            } catch (IOException e) {
                System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
            }
        }
    }

