package View;

import Model.Pessoa;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        
        byte voltar = 1;
        do{
            System.out.println("1 - Cadastre as idades" +
                               "        2 - Veja as idades cadastradas\n" +
                               "3 - Veja a média de idade" +
                               "        4 - Veja a maior idade\n" +
                               "5 - Conte quantos são maiores de idade" +
                               "        0 - Sair");
            byte escolher = in.nextByte();
            
            switch(escolher){
                case 1:
                    System.out.println("Cadastrando as idades...");
                    for(byte i = 0; i < p1.getIdade().length; i++){
                        System.out.println("Digite a " + (i + 1) + "ª idade:");
                        int idade = in.nextInt();
                        while(idade < 0 || idade > 150){
                            System.out.println("ERRO! Digite uma idade entre 0 e 150!");
                            idade = in.nextInt();
                        }
                        p1.cadastrar(i, idade);
                    }
                    break;

                    
                case 2:
                    System.out.println(p1);
                    break;
                    
                case 3:
                    System.out.println("A média das idades é: " + p1.calcularMedia());
                    break;
                    
                case 4:
                    System.out.println("A maior idade é: " + p1.verMaiorIdade());
                    break;
                    
                case 5:
                    System.out.println("Dentre as idades cadastradas, tem " + p1.verMaior18() + " maiores de idade.");
                    break;
                    
                case 0:
                    System.out.println("Saindo...");
                    voltar = 0;
                    break;
                    
                default:
                    System.out.println("Número inválido!");
            }
        } while(voltar != 0);
    }
}
