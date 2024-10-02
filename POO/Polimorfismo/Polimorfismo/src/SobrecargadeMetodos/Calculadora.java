package SobrecargadeMetodos;

public class Calculadora {
    // A sobrecarga significa ter vários métodos com o mesmo nome, mas que aceitam diferentes tipos ou números de argumentos.

    int somar(int a, int b){
        return a + b;
    }
    double somar(double a, double b){
        return a + b;
    }
}
// Dependendo dos valores que você passa, o Java escolhe o método correto.

