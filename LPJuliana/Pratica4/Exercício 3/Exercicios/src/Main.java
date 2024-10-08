import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] evenNumbers = new int[10]; // Vetor para armazenar até 10 números pares
        int count = 0; // Contador de números pares armazenados
        int sum = 0; // Soma dos números pares para calcular a média
        int max = Integer.MIN_VALUE; // Inicializa o maior valor com o menor valor possível

        // a) Ler 10 números e armazenar apenas os pares
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int number = scanner.nextInt();

            // Verifica se o número é par
            if (number % 2 == 0) {
                evenNumbers[count] = number;
                sum += number; // Adiciona à soma para o cálculo da média
                if (number > max) {
                    max = number; // Atualiza o maior valor se o número atual for maior
                }
                count++; // Incrementa o contador de números pares armazenados
            }
        }

        // b) Imprimir quantidade de valores armazenados, maior valor e média
        System.out.println("\nQuantidade de números pares armazenados: " + count);

        if (count > 0) {
            System.out.println("O maior número par é: " + max);
            double average = (double) sum / count; // Calcula a média
            System.out.println("A média dos números pares é: " + average);
        } else {
            System.out.println("Nenhum número par foi armazenado.");
        }

        scanner.close();
    }
}
