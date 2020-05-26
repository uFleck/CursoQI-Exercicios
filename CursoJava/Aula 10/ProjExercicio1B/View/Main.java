package View;

import Model.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno a1 = new Aluno();
        
        System.out.println("Digite a primeira nota: ");
        a1.setNota1(ler.nextDouble());
        
        System.out.println("Digite a segunda nota: ");
        a1.setNota2(ler.nextDouble());
        
        System.out.println("Digite a terceira nota: ");
        a1.setNota3(ler.nextDouble());
        
        System.out.println("Sua média é: " + a1.calcularMedia());
        System.out.println("Você foi " + a1.verResultado());
        System.out.println(a1);
    }
}
