import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = new int[8]; // Vetor de 8 posições

        // Leitura do vetor
        System.out.println("Digite 8 números:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Digite um número: ");
            numbers[i] = scanner.nextInt();
        }

        // Troca os 4 primeiros valores pelos 4 últimos
        for (int i = 0; i < 4; i++) {
            int temp = numbers[i]; // Armazena temporariamente o valor do início
            numbers[i] = numbers[7 - i]; // Substitui o valor do início pelo valor do final
            numbers[7 - i] = temp; // Coloca o valor temporário no final
        }

        // Exibe o vetor final em uma única linha
        for (int number : numbers) {
            System.out.print(number);
        }

        scanner.close();
    }
}
