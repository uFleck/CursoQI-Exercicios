package View;

import java.util.*;
import Model.Calculo;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Calculo c1 = new Calculo();
        
        System.out.println("Digite o primeiro valor: ");
        c1.valor1 = ler.nextDouble();
        System.out.println("Digite o segundo valor: ");
        c1.valor2 = ler.nextDouble();
        System.out.println("Digite o terceiro valor: ");
        c1.valor3 = ler.nextDouble();
        System.out.println("O produto entre todos esses valores é: " + c1.calcularProduto());
        System.out.println(c1);
    }
}
