package Ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class CadastrodeAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US); // Para garantir que o ponto seja usado como separador decimal
        Aluno[] alunos = new Aluno[10];

        System.out.println("Cadastro de 10 alunos:");

        // Coletar dados dos 10 alunos
        for (int i = 0; i < 10; i++) {
            System.out.println("Aluno " + (i + 1) + ":");
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("Nota 1: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Nota 2: ");
            double nota2 = scanner.nextDouble();
            scanner.nextLine(); // Limpar o buffer de nova linha

            // Criar o aluno e calcular a média
            alunos[i] = new Aluno(nome, nota1, nota2);
        }

        scanner.close();

        // Salvar dados dos alunos em um arquivo de texto
        try (PrintWriter writer = new PrintWriter(new FileWriter("cadastro_alunos.txt"))) {
            for (Aluno aluno : alunos) {
                writer.printf("Nome: %s, Nota 1: %.2f, Nota 2: %.2f, Média: %.2f%n",
                        aluno.nome, aluno.nota1, aluno.nota2, aluno.media);
            }
            System.out.println("Cadastro dos alunos salvo com sucesso no arquivo 'cadastro_alunos.txt'.");
        } catch (IOException e) {
            System.err.println("Erro ao salvar o arquivo: " + e.getMessage());
        }
    }
}

