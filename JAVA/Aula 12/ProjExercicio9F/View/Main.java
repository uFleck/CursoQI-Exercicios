package View;

import java.util.Scanner;
import Model.Aluno;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Aluno a1 = new Aluno();
        
        System.out.println("Digite o nome do aluno: ");
        a1.setNome(input.nextLine());
        System.out.println("Digite a primeira nota: ");
        a1.setNota1(input.nextDouble());
        System.out.println("Digite a segunda nota: ");
        a1.setNota2(input.nextDouble());
        System.out.println("Digite o número de faltas: ");
        a1.setNumeroFaltas(input.nextInt());
        System.out.println("Digite o número total de aulas");
        a1.setNumeroAulas(input.nextInt());
        
        System.out.println(a1);
        System.out.println("A média do aluno é: " + a1.calcularMedia());
        System.out.println("A frequência do aluno foi de: " + a1.calcularFrequencia() + "%");
        System.out.println(a1.resultado());
    }
}
