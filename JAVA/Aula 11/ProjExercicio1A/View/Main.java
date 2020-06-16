package View;

import java.util.Scanner;
import Model.Pessoa;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        DecimalFormat df = new DecimalFormat("##.##");
        
        System.out.println("Digite sua altura: ");
        p1.setAltura(input.nextDouble());
        
        System.out.println("\nDigite o número correspondente ao seu sexo: \n1 = Feminino \n2 = Masculino");
        p1.setSexo(input.nextByte());
        
        if(p1.getSexo() > 2 || p1.getSexo() < 1){
            System.out.println("\nNúmero inválido");
        }
        
        System.out.println("\n" + p1);
        System.out.println("Seu peso ideal é: " + df.format(p1.calcularPeso()));
        System.out.println("");
    }
}
