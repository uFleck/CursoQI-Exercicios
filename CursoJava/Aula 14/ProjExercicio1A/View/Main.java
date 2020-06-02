package View;

import java.util.Scanner;
import Model.Vendedor;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,000");
        
        System.out.println("Digite seu nome: ");
        String nome = input.next();
        System.out.println("Digite o total de vendas de Janeiro: ");
        double vendasJaneiro = input.nextDouble();
        System.out.println("Digite o total de vendas de Fevereiro: ");
        double vendasFevereiro = input.nextDouble();
        System.out.println("Digite o total de vendas de Março: ");
        double vendasMarco = input.nextDouble();
        
        Vendedor v1 = new Vendedor(nome, vendasJaneiro, vendasFevereiro, vendasMarco);
        
        System.out.println(v1);
        System.out.println("O vendedor " + v1.getNome() + ", vendeu R$" + df.format(v1.calcularMediaVendas()) + " e sua categoria é: " + v1.verCategoria());
    }
}
