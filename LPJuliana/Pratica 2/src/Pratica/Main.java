package Pratica;

public class Main {
    public static void main(String[] args) {
        // Create a Data object
        Data dataNasc = new Data(10, 12, 2000);

        // Create an Aluno object
        Aluno aluno = new Aluno(12345, "João Silva", 'M', "123456789", "12345678900", dataNasc);

        // Print the student's information
        aluno.imprimir();
    }
}