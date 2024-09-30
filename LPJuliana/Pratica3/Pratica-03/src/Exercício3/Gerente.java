package Exercício3;

import java.util.Objects;

public class Gerente extends Funcionario {
    private int senha;

    public Gerente(String nome, int cpf, double salario, int senha) {
        super(nome, cpf, salario);
        this.senha = senha;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senhaInformada) {
        return this.senha == senhaInformada;
    }
}


