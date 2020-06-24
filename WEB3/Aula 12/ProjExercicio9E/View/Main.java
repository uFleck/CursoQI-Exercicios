package View;

import java.util.Scanner;
import Model.Pessoa;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        DecimalFormat df = new DecimalFormat("00.00");
        
        System.out.println("Digite seu nome: ");
        p1.setNome(input.nextLine());
        System.out.println("Digite seu peso: ");
        p1.setPeso(input.nextDouble());
        System.out.println("Digite sua altura: ");
        p1.setAltura(input.nextDouble());
        
        System.out.println(p1);
        System.out.println("\nO seu IMC(Índice de Massa Corporal) é: " + df.format(p1.calcularIMC()));
        System.out.println("Você está com " + p1.verCategoria());
    }
}
