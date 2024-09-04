package Pratica;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Constructor
    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    // Method to format the date
    public String formatarData() {
        return dia + "/" + mes + "/" + ano;
    }

    // Getters and Setters (if needed)
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    // ... (Getters and Setters for mes and ano)
}