import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] A = new int[10]; // Vetor A com 10 elementos
        int[] B = new int[10]; // Vetor B com 10 elementos

        // Leitura dos elementos do vetor A
        System.out.println("Digite os elementos do vetor A:");
        for (int i = 0; i < A.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            A[i] = scanner.nextInt();
        }

        // Leitura dos elementos do vetor B
        System.out.println("Digite os elementos do vetor B:");
        for (int i = 0; i < B.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            B[i] = scanner.nextInt();
        }

        // Cálculo do produto escalar P
        int P = 0; // Inicializa o produto escalar
        for (int i = 0; i < A.length; i++) {
            P += A[i] * B[i]; // Soma o produto dos elementos correspondentes
        }

        // Exibe o resultado
        System.out.println("O produto escalar P de A por B é: " + P);

        scanner.close();
    }
}
