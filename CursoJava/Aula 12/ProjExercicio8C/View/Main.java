package View;

import java.util.Scanner;
import Model.Produto;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto p1 = new Produto();
        DecimalFormat df = new DecimalFormat("#0,##");
        
        System.out.println("Digite o nome do produto: ");
        p1.setNome(input.nextLine());
        System.out.println("Digite o valor: ");
        p1.setValor(input.nextDouble());
        System.out.println("Digite a quantidade: ");
        p1.setQuantidade(input.nextInt());
        
        System.out.println(p1);
        System.out.println("\nO total a pagar é: " + df.format(p1.calcularTotal()));
    }
}
