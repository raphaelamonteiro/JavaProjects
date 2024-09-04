package Pratica;

public class Aluno {
    private int ra;
    private String nome;
    private char sexo;
    private String rg;
    private String cpf;
    private Data dataNasc;

    public Aluno(int ra, String nome, char sexo, String rg, String cpf, Data dataNasc) {
        this.ra = ra;
        this.nome = nome;
        this.sexo = sexo;
        this.rg = rg;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
    }

    public void imprimir() {
        System.out.println("RA: " + ra);
        System.out.println("Nome: " + nome);
        System.out.println("Sexo: " + sexo);
        System.out.println("RG: " + rg);
        System.out.println("CPF: " + cpf);
        System.out.println("Data de Nascimento: " + dataNasc.formatarData());
    }
}