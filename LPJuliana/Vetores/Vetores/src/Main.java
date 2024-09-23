public class Main {
    public static void main(String[] args) {
        int vetor[]; //declaração do vetor
        vetor = new int[5];
        vetor[0] = 5;
        vetor[1] = 2;
        vetor[2] = 4;
        vetor[3] = 8;
        vetor[4] = 10;
        int soma = vetor[0] + vetor[1] + vetor[2] + vetor[3] + vetor[4];
        
        System.out.println(soma);
    }
}