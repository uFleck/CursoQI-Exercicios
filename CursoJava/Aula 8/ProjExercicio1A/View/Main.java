package View;

import Model.Retangulo;
import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Retangulo r1 = new Retangulo();
        
        System.out.println("Digite o valor da base: ");
        r1.setBase(ler.nextDouble());
        
        System.out.println("Digite o valor da altura: ");
        r1.setAltura(ler.nextDouble());
        
        System.out.println("A area do retângulo é: " + r1.calcularArea());
        System.out.println(r1);
    }
}
