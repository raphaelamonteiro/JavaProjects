package aula;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args){
        String nome = JOptionPane.showInputDialog("Entre com um nome: ");
        if (nome != null && !nome.equals("")){
            System.out.println(nome);
        }
    }

}
