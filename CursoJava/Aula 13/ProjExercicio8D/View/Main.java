package View;

import java.util.Scanner;
import Model.Modelo;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Modelo m1 = new Modelo();
        
        System.out.println("Digite seu nome: ");
        m1.setNome(input.nextLine());
        System.out.println("Digite seu peso: ");
        m1.setPeso(input.nextDouble());
        System.out.println("Digite sua altura: ");
        m1.setAltura(input.nextDouble());
        System.out.println("Digite a cor de seus olhos: ");
        m1.setCorOlhos(input.next());
        System.out.println("Digite a cor de seus cabelos: ");
        m1.setCorCabelos(input.next());
        System.out.println("Digite o número correspondente ao seu sexo: \n1 = Feminino \n2 = Masculino");
        m1.setSexo(input.nextByte());
        if(m1.getSexo() < 1 || m1.getSexo() > 2){
            System.out.println("Número inválido.");
        }
        System.out.println(m1);
    }
}
