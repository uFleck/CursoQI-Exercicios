package View;

import java.util.Scanner;
import Model.DiaSemana;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        DiaSemana d1 = new DiaSemana();
        
        System.out.println("Digite um número: ");
        d1.setNumero(ler.nextInt());
        
        System.out.println(d1.acharDiaDaSemana());
        System.out.println(d1);
    }
}
