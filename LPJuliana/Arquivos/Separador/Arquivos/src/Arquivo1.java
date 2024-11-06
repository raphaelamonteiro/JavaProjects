import java.io.File;

public class Arquivo1 {
    public static void main(String[] args){
        char c = File.separatorChar;

        System.out.println("Separador: " + c);
        //Retorna o caractere de separação do sistema operacional em que programa está sendo executado.
    }
}
