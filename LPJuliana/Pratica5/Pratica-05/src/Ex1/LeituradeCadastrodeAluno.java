package Ex1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class LeituradeCadastrodeAluno {
    public static void main(String[] args) {
        String nomeArquivo = "cadastro_alunos.txt";
        double somaMedias = 0;
        int totalAlunos = 0;

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;

            System.out.println("Dados dos alunos:");

            // Ler cada linha do arquivo e exibir os dados do aluno
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);

                // Extrair a média de cada aluno da linha lida
                String[] dados = linha.split(", ");
                String mediaStr = dados[3].split(": ")[1];
                double media = Double.parseDouble(mediaStr);

                // Acumular a média para o cálculo da média geral
                somaMedias += media;
                totalAlunos++;
            }

            // Calcular e exibir a média geral da turma
            if (totalAlunos > 0) {
                double mediaGeral = somaMedias / totalAlunos;
                System.out.printf(Locale.US, "Média Geral da Turma: %.2f%n", mediaGeral);
            } else {
                System.out.println("Nenhum dado de aluno encontrado.");
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.err.println("Erro ao formatar um valor numérico: " + e.getMessage());
        }
    }
}
