package View;

import java.util.Scanner;
import Model.Numero;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,###,###");
        
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        
        Numero n1 = new Numero(numero);
        
        System.out.println("Somatório: " + df.format(n1.calcularSomatorio()));
        System.out.println("Fatorial: " + df.format(n1.calcularFatorial()));
        System.out.println("Total de ímpares: " + n1.verImpares());
        System.out.println("Total de pares: " + n1.verPares());
    }
}





