//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double Celsius, Kelvin, Fahrenheit;
        Celsius = 2.43;

        Fahrenheit = Celsius * 1.8 + 32;
        Kelvin = Celsius + 273.15;

        System.out.println("A temperatura em Fahrenheit é: " + Fahrenheit);
        System.out.println("A temperatura em Kelvin é: " + Kelvin);
    }
}