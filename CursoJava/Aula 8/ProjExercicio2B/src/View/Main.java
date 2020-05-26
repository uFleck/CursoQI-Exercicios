package View;

import java.util.Scanner;
import Model.Produto;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Produto p1 = new Produto();
        
        System.out.println("Digite o nome do produto: ");
        p1.nome = ler.nextLine();
        
        System.out.println("Digite o preço do produto: ");
        p1.valorCusto = ler.nextDouble();
        
        System.out.println("Digite a quantidade: ");
        p1.quantidade = ler.nextInt();
        
        System.out.println("O total a pagar é: " + p1.calcularTotal());
        System.out.println("O total a pagar com 35% de juros é: " + p1.calcularJuros());
        System.out.println("O total a pagar com 22% de desconto é: " + p1.calcularDesconto());
        
        System.out.println(p1);
    }
}
