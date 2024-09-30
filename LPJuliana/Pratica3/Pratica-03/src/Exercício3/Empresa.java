package Exercício3;

public class Empresa {
    //Main
    public static void main(String[] args) {
        Gerente gerente1 = new Gerente("Raul", 123456789,8000.00, 231);
        Gerente gerente2 = new Gerente("Raphaela", 987654321,80000.0, 321);

        System.out.println("Gerente 1: " + gerente1.getNome() + " CPF: " + gerente1.getCpf() + " Salário: " + gerente1.getSalario());
        System.out.println("Gerente 2: " + gerente2.getNome() + " CPF: " + gerente2.getCpf() + " Salario: " + gerente2.getSalario());

        System.out.println("Autenticação Gerente 1: " + gerente1.autentica(123));
        System.out.println("Autenticação Gerente 2: " + gerente2.autentica(321));
    }
}
