package SobrescritadeMetodos;

public class Pato extends Animal{
    @Override
    void fazerSom() {
       System.out.println("Quack");
    }
}

// Pato sobrescreve o método fazerSom() para que ele faça algo diferente.
//O Polimorfismo em Tempo de Execução (Sobrescrita): O comportamento é decidido em tempo de execução, dependendo do tipo real do objeto que chama o método.