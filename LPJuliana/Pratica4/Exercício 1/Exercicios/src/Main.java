import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int[] numbers = new int[10]; // Vetor para armazenar os 10 números

                // a) Ler 10 números a partir do input do usuário
                System.out.println("Digite 10 números inteiros:");
                for (int i = 0; i < numbers.length; i++) {
                    System.out.print("Número " + (i + 1) + ": ");
                    numbers[i] = scanner.nextInt();
                }

                // b) Imprimir os 10 números
                System.out.println("\nOs números digitados são:");
                for (int number : numbers) {
                    System.out.println(number);
                }

                scanner.close();
            }
        }