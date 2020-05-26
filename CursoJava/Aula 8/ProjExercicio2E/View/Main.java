package View;

import java.util.Scanner;
import Model.Temperatura;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Temperatura t1 = new Temperatura();
        
        System.out.println("Digite uma temperatura em Celsius: ");
        t1.celsius = ler.nextDouble();
        
        System.out.println(t1.celsius + "°C equivalem à: ");
        System.out.println(t1.calcularFahrenheit() + "°F");
        System.out.println(t1.calcularKelvin() + "K");
        
        System.out.println(t1);
    }
}
