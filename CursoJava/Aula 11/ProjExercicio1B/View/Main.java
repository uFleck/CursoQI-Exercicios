package View;

import java.util.Scanner;
import Model.Nadador;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Nadador n1 = new Nadador();
        
        System.out.println("Digite seu nome: ");
        n1.setNome(input.nextLine());
        
        System.out.println("Digite a sua idade: ");
        n1.setIdade(input.nextByte());
        
        System.out.println(n1);
        if(n1.getIdade() < 8 || n1.getIdade() > 70){
            System.out.println(n1.getNome() + ", você não pode ser nadador.");
        }else{
        System.out.println(n1.getNome() + ", Você será nadador na categoria: " + n1.verClassificacao());
        }
    }
}
