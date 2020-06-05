package View;

import java.util.Scanner;
import Model.Numero;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#,###,###,###.##");
        
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        
        Numero n1 = new Numero(numero);
        
        boolean voltar = false;
        byte selecItem;
        do{
            System.out.println("\nO que você deseja fazer?");
            System.out.println("1 - Alterar Número                   2 - Ver número digitado"
                              + "\n3 - Ver somatório do n°              4 - Ver se é ímpar ou par"
                              + "\n5 - Ver se é Pos, Neg ou Nulo        6 - Extrair raíz quadrada"
                              + "\n7 - Calcular o dobro do n°           8 - Calcular tabuada do n°"
                              + "\n9 - Calcular fatorial                10 - Total de ímpares e pares"
                              + "\n                         0 - Sair");
            selecItem = input.nextByte();
            switch(selecItem){
                case 1:
                    byte voltar1 = 0;
                    do{
                        System.out.println("\n****************************");
                        System.out.println("Digite um número:");
                        System.out.println("****************************");
                        n1.setNumero(input.nextInt());
                        System.out.println("Número atualizado com sucesso! \n1 - voltar");
                        voltar1 = input.nextByte();
                    } while(voltar1 != 1);
                    break;
                case 2:
                    byte voltar2 = 0;
                    do{
                        System.out.println("\n****************************" + n1);
                        System.out.println("****************************");
                        System.out.println("1 - voltar");
                        voltar2 = input.nextByte();
                    } while(voltar2 != 1);
                    break;
                case 3:
                    byte voltar3 = 0;
                    do{
                        System.out.println("\n****************************");
                        System.out.println("Somatório: " + df.format(n1.calcularSomatorio()));
                        System.out.println("****************************");
                        System.out.println("1 - voltar");
                        voltar3 = input.nextByte();
                    } while(voltar3 != 1);
                    break;
                case 4:
                    byte voltar4 = 0;
                    do{
                        System.out.println("\n****************************");
                        System.out.println("O número é: " + n1.verSeEParOuImpar());
                        System.out.println("****************************");
                        System.out.println("1 - voltar");
                        voltar4 = input.nextByte();
                    } while(voltar4 != 1);
                    break;
                case 5:
                    byte voltar5 = 0;
                    do{
                        System.out.println("\n****************************");
                        System.out.println("O número é: " + n1.VerSeONumeroEPositivoNegativoOuNulo());
                        System.out.println("****************************");
                        System.out.println("1 - voltar");
                        voltar5 = input.nextByte();
                    } while(voltar5 != 1);
                    break;
                case 6:
                    byte voltar6 = 0;
                    do{
                        System.out.println("\n****************************");
                        System.out.println("A raiz quadrada do número é: " + df.format(n1.calcularRaizQuadradaDoNumero()));
                        System.out.println("****************************");
                        System.out.println("1 - voltar");
                        voltar6 = input.nextByte();
                    } while(voltar6 != 1);
                    break;
                case 7:
                    byte voltar7 = 0;
                    do{
                        System.out.println("\n****************************");
                        System.out.println("O dobro do número é: " + df.format(n1.calcularDobroDoNumero()));
                        System.out.println("****************************");
                        System.out.println("1 - voltar");
                        voltar7 = input.nextByte();
                    } while(voltar7 != 1);
                    break;
                case 8:
                    byte voltar8 = 0;
                    do{
                        System.out.println("\n****************************");
                        System.out.println("Tábuada do " + n1.getNumero() + ":");
                        System.out.println(n1.calcularTabuadaDoNumero());
                        System.out.println("****************************");
                        System.out.println("1 - voltar");
                        voltar8 = input.nextByte();
                    } while(voltar8 != 1);
                    break;
                case 9:
                    byte voltar9 = 0;
                    do{
                        System.out.println("\n****************************");
                        System.out.println("Fatorial: " + df.format(n1.calcularFatorial()));
                        System.out.println("****************************");
                        System.out.println("1 - voltar");
                        voltar9 = input.nextByte();
                    } while(voltar9 != 1);
                    break;
                case 10:
                    byte voltar10 = 0;
                    do{
                        System.out.println("\n****************************");
                        System.out.println("Total de ímpares: " + n1.verImpares());
                        System.out.println("Total de pares: " + n1.verPares());
                        System.out.println("****************************");
                        System.out.println("1 - voltar");
                        voltar10 = input.nextByte();
                    } while(voltar10 != 1);
                    break;
                case 0:
                    System.out.println("\nSaindo...");
                    voltar = true;
                    break;
                default:
                    System.out.println("\nNúmero digitado incorreto;");
            }
        } while(voltar == false);      
    }
}





