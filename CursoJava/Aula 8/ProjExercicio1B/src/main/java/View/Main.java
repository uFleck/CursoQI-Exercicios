package View;

import Model.Aluno;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno a1 = new Aluno();
        
        System.out.println("Digite seu nome: ");
        a1.setNome(ler.nextLine());
        System.out.println("Digite a sua primeira nota: ");
        a1.setNota1(ler.nextDouble());
        System.out.println("Digite a sua segunda nota: ");
        a1.setNota2(ler.nextDouble());
        System.out.println("Digite a sua terceira nota: ");
        a1.setNota3(ler.nextDouble());
        System.out.println("A sua média foi: " + a1.calcularMedia());
        System.out.println(a1);
    }
}
