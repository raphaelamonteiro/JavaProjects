package Exercício1;

public class Main {
        public static void main(String[] args) {
            Funcionario funcionario = new Funcionario("123456789","Raphaela",  50000.0);
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("RG: " + funcionario.getRG());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Salário com aumento de 10%: " + funcionario.aumentarSalario(0.10));
        }
    }
