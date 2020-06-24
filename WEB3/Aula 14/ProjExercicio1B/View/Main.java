package View;

import Model.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno: ");
        String nome = input.next();
        System.out.println("Digite a primeira nota: ");
        double nota1 =  input.nextDouble();
        System.out.println("Digite o peso da primeira nota: ");
        double peso1 = input.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double nota2 = input.nextDouble();
        System.out.println("Digite o peso da segunda nota: ");
        double peso2 = input.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double nota3 = input.nextDouble();
        System.out.println("Digite o peso da terceira nota: ");
        double peso3 = input.nextDouble();
        
        Aluno a1 = new Aluno(nome, nota1, nota2, nota3);
        
        System.out.println(a1);
        System.out.println("A média ponderada do " + nome + " é: " + a1.calcularMedia(peso1, peso2, peso3));
    }
}
