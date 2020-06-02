package View;

import java.util.Scanner;
import Model.Aluno;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno a1 = new Aluno();
        
        System.out.println("Digite a primeira nota: ");
        a1.setNota1(input.nextDouble());
        System.out.println("Digite a segunda nota: ");
        a1.setNota2(input.nextDouble());
        System.out.println("Digite a terceira nota: ");
        a1.setNota3(input.nextDouble());
        System.out.println("Digite a quarta nota: ");
        a1.setNota4(input.nextDouble());
        
        System.out.println(a1);
        System.out.println("Sua média é: " + a1.calcularMedia());
    }
}
