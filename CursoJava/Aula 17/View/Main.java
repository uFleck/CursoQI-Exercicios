package View;

import java.util.Scanner;
import Model.Funcionario;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var df = new DecimalFormat("#,##0.00");
        var f1 =  new Funcionario();
        
        System.out.println("Seja bem-vindo(a) à folha de pagamentos!");
        System.out.println("O que você deseja fazer?");
        
        byte voltar = 1;
        boolean conf = false;
        double valorTransporteMensal = 0;
        do{
            System.out.println("\n1 - Cadastrar dados                    2 - Ver Dados Cadastrados"
                              + "\n3 - Ver Sálario Bruto                  4 - Ver Sálario Família"
                              + "\n5 - Ver Valor do Vale Transporte       6 - Ver Insalubridade"
                              + "\n7 - Ver INSS                           8 - Ver Vale Refeição"
                              + "\n9 - Ver Total Horas Extras             10 - Ver Sálario Final"
                              + "\n                         0 - Sair");
            voltar = in.nextByte();
            
            switch(voltar){
                case 1:
                    byte voltar1 = 2;
                    do{
                        System.out.println("Digite seu nome:");
                        f1.setNome(in.next());
                        System.out.println("Digite seu CPF:");
                        f1.setCpf(in.next());
                        System.out.println("Digite seu cargo:");
                        f1.setCargo(in.next());
                        System.out.println("Digite o total ganho por hora:");
                        f1.setValorHora(in.nextDouble());
                        System.out.println("Digite o total de horas trabalhadas:");
                        f1.setQuantHoras(in.nextDouble());
                        System.out.println("Digite as horas extras em dias úteis:");
                        f1.setHorasExtras50(in.nextDouble());
                        System.out.println("Digite as horas extras em feriados:");
                        f1.setHorasExtras100(in.nextDouble());
                        System.out.println("Digite quantos dependentes você tem:");
                        f1.setDependentes(in.nextByte());
                        System.out.println("Digite o tipo de insalubridade: \n1 - 40% Grau Máximo \n2 - 20% Grau Médio \n3 - 10% Grau Mínimo \n4 - Sem Insalubridade");
                        f1.setTipoInsalubre(in.nextByte());
                        System.out.println("******************************");
                        System.out.println("Dados cadastrados com sucesso!");
                        System.out.println("******************************");
                        System.out.println("Voltar? \n1 - Sim, vamos lá!       2 - Não, quero refazer!");
                        voltar1 = in.nextByte();
                    }while(voltar1 == 2);
                    conf = true;
                    break;
                    
                case 2:
                    byte voltar2 = 2;
                    do{
                        if(conf == true){
                            
                            System.out.println("******************************");
                            System.out.println("Dados cadastrados:");
                            System.out.println(f1);
                            System.out.println("******************************");
                        } else{
                            System.out.println("*************************************");
                            System.out.println("Os dados ainda não foram cadastrados.");
                            System.out.println("*************************************");
                        }
                        System.out.println("Voltar? \n1 - Sim, senhor!      2 - Não, quero rever meus dados!");
                        voltar2 = in.nextByte();
                    } while(voltar2 == 2);
                    break;
                   
                case 3:
                    byte voltar3 = 2;
                    do{
                        System.out.println("**********************************");
                        System.out.println("Seu salário bruto é: " + df.format(f1.calcularBruto()));
                        System.out.println("**********************************");
                        System.out.println("Voltar? \n1 - Sim!      2 - Não, me mostre de novo!");
                        voltar3 = in.nextByte();
                    } while(voltar3 == 2);
                    break;
                
                case 4:
                    byte voltar4 = 2;
                    do{
                        System.out.println("*********************************");
                        System.out.println("Salário família: " + df.format(f1.calcularSalarioFamilia()));
                        System.out.println("*********************************");
                        System.out.println("Voltar? \n1 - Claro!        2 - Não!");
                        voltar4 = in.nextByte();
                    } while(voltar4 == 2);                    
                    break;
                    
                case 5:
                    byte voltar5 = 2;
                    do{
                        System.out.println("Digite o total gasto com o vale transporte mensalmente:");
                        valorTransporteMensal = in.nextDouble();
                        System.out.println("******************************");
                        System.out.println("Valor do vale transporte: " + df.format(f1.calcularValeTransporte(valorTransporteMensal)));
                        System.out.println("******************************");
                        System.out.println("Voltar? \n1 - Sim!      2 - Não!");
                        voltar5 = in.nextByte();
                    } while(voltar5 == 2);
                    break;
                    
                case 6:
                    byte voltar6 = 2;
                    do{
                        System.out.println("******************************");
                        System.out.println("A sua insalubridade é de: " + df.format(f1.calcularInsalubridade()));
                        System.out.println("******************************");
                        System.out.println("Voltar? \n1 - Siim!     2 - Nãoo!");
                        voltar6 = in.nextByte();
                    } while(voltar6 == 2);
                    break;
                    
                case 7:
                    byte voltar7 = 2;
                    do{
                        System.out.println("******************************");
                        System.out.println("O total do INSS é: " + df.format(f1.calcularINSS()));
                        System.out.println("******************************");
                        System.out.println("Voltar? \n1 - Sim!!     2 - Não!!");
                        voltar7 = in.nextByte();
                    } while(voltar7 == 2);
                    break;
                    
                case 8:
                    byte voltar8 = 2;
                    do{
                        System.out.println("******************************");
                        System.out.println("Vale refeição: " + df.format(f1.calcularValeRefeicao(valorTransporteMensal)));
                        System.out.println("******************************");
                        System.out.println("Voltar? \n1 - Claro!        2 - Não!");
                        voltar8 = in.nextByte();
                    } while(voltar8 == 2);
                    break;
                    
                case 9:
                    byte voltar9 = 2;
                    do{
                        System.out.println("******************************");
                        System.out.println("Total de horas extras: " + f1.calcularTotalExtra());
                        System.out.println("******************************");
                        System.out.println("Voltar? \n1 - Sim!      2 - Não!");
                        voltar9 = in.nextByte();
                    } while(voltar9 == 2);
                    break;
                
                case 10:
                    byte voltar10 = 2;
                    do{
                        System.out.println("******************************");
                        System.out.println("Sálario final: " + df.format(f1.calcularLiquido()));
                        System.out.println("******************************");
                        System.out.println("Voltar? \n1 - Sim!      2 - Não!");
                        voltar10 = in.nextByte();
                    } while(voltar10 == 2);
                    break;
                    
                case 0:
                    System.out.println("Saindo... ");
                    voltar = 0;
                    break;
                    
                default:
                    System.out.println("Número inválido!");
            }
        } while(voltar != 0);
    }
}
