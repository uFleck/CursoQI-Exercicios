package View;

import java.util.*;
import Model.Aluno;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Aluno a1 = new Aluno();
        DecimalFormat df = new DecimalFormat("#0.0");
        
        System.out.println("Digite o nome do aluno: ");
        a1.setNome(ler.nextLine());
        System.out.println("Digite a primeira nota: ");
        a1.setNota1(ler.nextDouble());
        System.out.println("Digite a segunda nota: ");
        a1.setNota2(ler.nextDouble());
        System.out.println("Digite a terceira nota: ");
        a1.setNota3(ler.nextDouble());
        System.out.println("Digite a frequencia do aluno: ");
        a1.setFrequencia(ler.nextDouble());
        
        System.out.println(a1.getNome() + ", sua média é: " + df.format(a1.calcularMedia()) + " e sua frequência é: " + a1.getFrequencia());
        System.out.println(a1);
    }
}
