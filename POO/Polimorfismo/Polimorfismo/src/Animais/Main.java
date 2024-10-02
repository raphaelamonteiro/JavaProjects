package Animais;

public class Main {
        public static void main(String[] args) {
            Animal meuAnimal1 = new Cachorro();  // meuAnimal1 é um Cachorro
            Animal meuAnimal2 = new Gato();      // meuAnimal2 é um Gato

            meuAnimal1.fazerSom();  // Saída: Latido
            meuAnimal2.fazerSom();  // Saída: Miau
        }
}
