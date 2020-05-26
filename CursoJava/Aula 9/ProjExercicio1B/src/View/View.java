package View;

import java.util.Scanner;
import Model.Pessoa;

public class View {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite seu ano de nascimento: ");
        p1.setAnoNascimento(ler.nextInt());
        
        System.out.println("Digite o ano atual: ");
        p1.setAnoAtual(ler.nextInt());
        
        System.out.println("Você tem " + p1.calcularIdade() + " anos de idade;");
        System.out.println("Em 2030 você terá " + p1.calcularIdadeFuturo() + " anos de idade.");
        System.out.println(p1);
    }
}
