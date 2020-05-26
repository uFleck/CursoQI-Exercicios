package View;

import java.util.*;
import Model.Circulo;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Circulo c1 = new Circulo();
        
        System.out.println("Digite o raio do circulo: ");
        c1.setRaio(ler.nextDouble());
        System.out.println("A área do círculo é: " + c1.calcularArea());
        System.out.println("O perímetro do círculo é: " + c1.calcularPerimetro());
        System.out.println(c1);
    }
}
