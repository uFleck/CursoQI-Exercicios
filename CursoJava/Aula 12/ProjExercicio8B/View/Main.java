package View;

import java.util.Scanner;
import Model.Funcionario;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Funcionario f1 = new Funcionario();
        
        System.out.println("Digite seu nome: ");
        f1.setNome(input.nextLine());
        System.out.println("Digite sua carga horária: ");
        f1.setCargaHoraria(input.nextDouble());
        System.out.println("Digite quanto você ganha por hora: ");
        f1.setValorHora(input.nextDouble());
        
        System.out.println(f1);
        System.out.println("Seu sálario é: " + f1.calcularSalario());
    }
}
