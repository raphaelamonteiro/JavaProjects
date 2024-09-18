package folha;

public class Horista extends Empregado {
    private double horas;

    public Horista(double horas, String nome, String endereco, Double salario){
        super(nome, endereco, salario);
        this.horas = horas;
    }

    public double getHoras(){
        return horas;
    }
    public void setHoras(double horas) {
        this.horas = horas;
    }
    public void cal_Salario()
    {
        salario = horas * 50;
    }

}
