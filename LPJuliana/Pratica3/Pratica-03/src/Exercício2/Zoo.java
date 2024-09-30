package Exercício2;

public class Zoo {
    //Main
    public static void main(String[] args) {
        Cachorro cachorro1 = new Cachorro("Louie", 3.5, "Yorkshire Terrier");
        Cachorro cachorro2 = new Cachorro("Ricardo", 64.0, "São Bernardo");
        Peixe peixe1 = new Peixe("Dolores", 2.0,"Água salgada");
        Peixe peixe2 = new Peixe("Coral", 2.8,"Água doce");

        System.out.println("Cachorro 1: " + cachorro1.getNome() + ", Peso: " + cachorro1.getPeso() + ", Raça: " + cachorro1.getRaca());
        System.out.println("Cachorro 2: " + cachorro2.getNome() + ", Peso: " + cachorro2.getPeso() + ", Raça: " + cachorro2.getRaca());
        System.out.println("Peixe 1: " + peixe1.getNome() + ", Peso: " + peixe1.getPeso() + ", Habitat: " + peixe1.getTipoHabitat());
        System.out.println("Peixe 2: " + peixe2.getNome() + ", Peso: " + peixe2.getPeso() + ", Habitat: " + peixe2.getTipoHabitat());
    }
}

