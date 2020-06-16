package View;

import java.util.Scanner;
import Model.Numero;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Numero n1 = new Numero();
        
        System.out.println("Digite o primeiro número: ");
        n1.setN1(input.nextInt());
        System.out.println("Digite o segundo número: ");
        n1.setN2(input.nextInt());
        System.out.println("Digite o terceiro número: ");
        n1.setN3(input.nextInt());
        
        System.out.println(n1);
        System.out.println("\nO maior número é: " + n1.encontrarMaior());
        System.out.println("O menor número é: " + n1.encontrarMenor());
    }
}
