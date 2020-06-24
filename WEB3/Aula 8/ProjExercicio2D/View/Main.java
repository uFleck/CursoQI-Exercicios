package View;

import java.util.Scanner;
import Model.Vendedor;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Vendedor v1 = new Vendedor();
        
        System.out.println("Digite seu salário: ");
        v1.salarioFixo = ler.nextDouble();
        
        System.out.println("Digite o total de vendas: ");
        v1.totalVendas = ler.nextDouble();
        
        System.out.println("Digite o percentual da comissão: ");
        v1.percentualComissao = ler.nextDouble();
        
        System.out.println("Total ganho de comissão: " + v1.calcularComissao());
        System.out.println("Total ganho em geral: " + v1.calcularTotal());
        System.out.println(v1);
    }
}
