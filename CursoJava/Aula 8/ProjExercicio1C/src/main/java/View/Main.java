package View;

import java.util.Scanner;
import Model.Conversor;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Conversor c1 = new Conversor();
        
        System.out.println("Digite um ano para a conversão: ");
        c1.setAno(ler.nextInt());
        
        System.out.println("Meses: " + c1.converterMeses());
        System.out.println("Semanas: " + c1.converterSemanas());
        System.out.println("Dias: " + c1.converterDias());
        
        System.out.println(c1);
    }
}
