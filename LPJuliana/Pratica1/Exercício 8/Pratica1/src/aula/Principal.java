package aula;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args){
        String valor = JOptionPane.showInputDialog("Entre com um número: ");
        int numero = Integer.parseInt(valor);
        if (numero % 2 == 0) {
           JOptionPane.showMessageDialog(null, "O número "+ numero+ " é par");
        } else{
            JOptionPane.showMessageDialog(null, "O número "+ numero+ " é ímpar");
        }
    }

}
