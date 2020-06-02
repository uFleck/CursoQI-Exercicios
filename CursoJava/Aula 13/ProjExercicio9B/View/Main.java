package View;

import java.util.Scanner;
import Model.Pessoa;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        
        System.out.println("Digite seu ano de nascimento: ");
        p1.setAnoNascimento(input.nextInt());
        
        System.out.println("Digite o ano atual: ");
        p1.setAnoAtual(input.nextInt());
        
        System.out.println("\n" + p1);
        System.out.println("\nSua idade(" + p1.calcularIdade() + ") corresponde a: ");
        System.out.println("Meses: " + p1.converterMeses());
        System.out.println("Semanas: " + p1.converterSemanas());
        System.out.println("Dias: " + p1.converterDias());
        System.out.println("Horas: " + p1.converterHoras());
        System.out.println("Minutos: " + p1.converterMinutos());
        System.out.println("Segundos: " + p1.converterSegundos());
    }
}
