package View;

import java.util.Scanner;
import Model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        
        System.out.println("Digite seu nome: ");
        f1.setNome(ler.nextLine());
        System.out.println("Digite seu CPF: ");
        f1.setCpf(ler.nextInt());
        System.out.println("Digite suas horas trabalhadas: ");
        f1.setHorasTrabalhadas(ler.nextDouble());
        
        System.out.println(f1.getNome() + " ganha R$ " + f1.salarioBruto() + " - pois trabalhou " + f1.getHorasTrabalhadas() + " horas este mês.");
        System.out.println("Seu salário aumentado em 10% ficará R$ " + f1.salarioBrutoAumento());
        System.out.println(f1);
    }
}
