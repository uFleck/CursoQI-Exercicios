package View;

import Model.Numero;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Numero n1 = new Numero();   
        
        System.out.println("Digite um número: ");
        n1.setN(ler.nextInt());
        
        System.out.println(n1);
        System.out.println(n1.verResultado());
    }
}
