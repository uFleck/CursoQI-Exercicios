package View;

import java.util.Scanner;
import Model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        
        System.out.println("Digite o seu salário fixo: ");
        f1.setSalarioFixo(input.nextDouble());
        System.out.println("Digite o valor de suas vendas: ");
        f1.setValorVendas(input.nextDouble());
        
        System.out.println(f1);
        System.out.println("Total ganho de comissão: " + f1.calcularComissao());
        System.out.println("Salário total: " + f1.calcularSalarioFinal());
    }
}
