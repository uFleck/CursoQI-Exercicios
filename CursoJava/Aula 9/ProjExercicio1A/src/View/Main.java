package View;

import java.util.Scanner;
import Model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite seu peso: ");
        p1.setPeso(ler.nextDouble());
        
        System.out.println("Se você engordar 15%, ficará com " + p1.engordar() + "Kg");
        System.out.println("Se você emagrecer 20%, ficará com " + p1.emagrecer() + "Kg");
        System.out.println(p1);
    }
}
