package View;

import java.util.Scanner;
import Model.Carro;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Carro c1 = new Carro();
        
        System.out.println("Digite o custo de fábrica de um carro: ");
        c1.custoFabrica = ler.nextDouble();
        
        System.out.println("O preço com 28% do distribuidor e 45% de imposto é: " + c1.calcularPreco());
        System.out.println(c1);
    }
}
