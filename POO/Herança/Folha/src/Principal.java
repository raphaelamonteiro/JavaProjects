import folha.Horista;
import folha.Mensalista;

public class Principal {
    public static void main(String[] args){
        Mensalista mens1;
        Horista hora1;

        //Empregado mensalista
        mens1 = new Mensalista("Junior", "Rachel", "Rua 29 de Abril", 0.0);
        mens1.cal_Salario();
        mens1.cal_Inss();
        mens1.imprimir();

        //Empregado horista
        hora1 = new Horista(100.00, "Ryan", "Rua do Centro", 0.0);
        hora1.cal_Salario();
        hora1.cal_Inss();
        hora1.imprimir();
    }
}

