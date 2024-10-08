import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inicializa o vetor com 10 valores
        int[] vetor = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        // Solicita ao usuário para inserir o valor de X
        System.out.print("Digite o valor de X para buscar no vetor: ");
        int x = scanner.nextInt();

        // Variável para armazenar a posição do valor encontrado
        int posicao = -1; // Inicializa como -1 para indicar não encontrado

        // Realiza a busca pelo valor de X no vetor
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == x) {
                posicao = i; // Atualiza a posição se o valor for encontrado
                break; // Sai do loop, pois já encontrou o valor
            }
        }

        // Verifica se o valor foi encontrado e exibe a mensagem apropriada
        if (posicao != -1) {
            System.out.println("O valor " + x + " foi encontrado na posição: " + posicao);
        } else {
            System.out.println("O valor " + x + " não foi encontrado no vetor.");
        }

        scanner.close();
    }
}
