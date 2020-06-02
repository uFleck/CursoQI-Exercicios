package View;

import java.util.Scanner;
import Model.Posto;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Posto p1 = new Posto();
    
        System.out.println("Digite o número correspondente ao tipo de combustível desejado: \n1 - Gasolina \n2 - Álcool \n3 - GNV \n4 - Diesel");
        p1.setTipoCombustivel(input.nextByte());
        System.out.println("Digite quantos litros deseja: ");
        p1.setLitrosAbastecer(input.nextDouble());
        
        System.out.println(p1);
        System.out.println("Total a pagar: " + p1.totalPagar());
    }
}
