import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o tamanho da sequência
        System.out.print("Digite a quantidade de números (n): ");
        int n = scanner.nextInt(); // Lê o número n

        // Cria um vetor para armazenar os n números
        int[] numbers = new int[n];

        // Lê os n números e armazena no vetor
        System.out.println("Digite os " + n + " números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Imprime os números na ordem inversa
        System.out.println("\nA sequência na ordem inversa é:");
        for (int i = n - 1; i >= 0; i--) {
            System.out.println(numbers[i]);
        }

        scanner.close();
    }
}
