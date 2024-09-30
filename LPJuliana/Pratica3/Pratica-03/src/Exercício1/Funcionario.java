package Exercício1;

public class Funcionario extends Pessoa {
    private Double salario;

    public Funcionario(String RG, String nome, double salario) {
        super(RG, nome);
        this.salario = salario;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public double aumentarSalario(double percentual) {
        return salario + (salario * percentual);
    }
}

