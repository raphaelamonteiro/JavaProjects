package aula;

public class Principal {
    public static void main (String[] args){
        int n = 1;
        int soma = 0;
        int impar = 0;
        while (n <= 100){
            if (n % 2 != 0){
                soma += n;
                n++;
                impar++;
            }
            else{
                n++;
            }
        }
        System.out.println((float)soma/impar);
    }
}
