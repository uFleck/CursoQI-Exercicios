package View;

import java.util.Scanner;
import Model.Usuario;
import java.util.Calendar;
import Model.Loja;
import java.text.DecimalFormat;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#,###,###");
        Scanner input = new Scanner(System.in);
        Usuario u1 = new Usuario();
        Loja l1 = new Loja();
        Calendar c1 = Calendar.getInstance();
        boolean confG = true;
        u1.setNivel(1);
        //inicio menu-criação de usuário
        System.out.println("---------------------------------");
        System.out.println("Seja bem-vindo(a) ao nosso joguinho!");
        System.out.println("---------------------------------");
        do{
            //nome:
            System.out.println("\nPrimeiro, digite seu nome: ");
            u1.setNome(input.next());
            
            //ano de nascimento:
            System.out.println("\nSeu ano de nascimento: ");
            int anoNascimento = input.nextInt();
            
            //calculando idade:
            int anoAtual = c1.get(Calendar.YEAR);
            u1.setIdade(anoAtual - anoNascimento);
            
            //definindo gênero:
            System.out.println("\nE o seu gênero: \n1 - Masculino \n2 - Feminino");
            u1.setGenero(input.nextByte());
            if(u1.getGenero() == 1 || u1.getGenero() == 2){
                System.out.println("Gênero confirmado!");
                confG = false;
            } else{
                System.out.println("Gênero inválido! \nPreencha seus dados novamente!");
            }
        }while(confG == true);
        System.out.println("\nUsuário criado com sucesso!");
        //fim menu-criação de usuário
        byte voltar;
        do{
            System.out.println("\n\nO que você deseja fazer? ");
            System.out.println("Trabalhar = 1       Ver dados = 2 "
                              + "\nLoja = 3        Parar o jogo = 4"
                              + "\nZERAR JOGO(1.000.000$) = 5");
            voltar = input.nextByte();
            switch(voltar){
                //trabalhar
                case 1:
                    byte voltar1;
                    do{
                        int salario = 10;
                        int experiencia = 5;
                        int multiplicadorS = 2 * l1.getQuantidadeD();
                        int multiplicadorE = 0;
                        switch(multiplicadorE){
                            case 9:
                                multiplicadorE = 2 * 10;
                            default:
                                multiplicadorE = 2 * l1.getQuantidadeE();
                        }
                        if(l1.getQuantidadeD() >= 1){
                            salario = salario * multiplicadorS;
                        }
                        if(l1.getQuantidadeE() >= 1){
                            experiencia = experiencia * multiplicadorE;
                        }
                        System.out.println("\nTrabalhei! ganhei " + salario + "$ e " + experiencia + "xp!");
                        u1.setProgressoNivel(u1.getProgressoNivel() + experiencia);
                        if(u1.getProgressoNivel() >= 100){
                            u1.setProgressoNivel(0);
                            u1.setNivel(u1.getNivel() + 1);
                            u1.setDinheiroNivel(u1.getDinheiroNivel() + 100);
                            u1.setDinheiro(u1.getDinheiro() + u1.getDinheiroNivel());
                            System.out.println("Parabéns! você evoluiu para o nível " + u1.getNivel() + "!");
                            System.out.println("Ganhou " + df.format(u1.getDinheiroNivel()) + "$ como recompensa!");
                        }
                        u1.setDinheiro(u1.getDinheiro() + salario);
                        System.out.println("Dinheiro total: " + df.format(u1.getDinheiro()) + "$");
                        System.out.println("Progresso para upar: " + u1.getProgressoNivel() + "%");
                        System.out.println("Trabalhar mais? \n1 - Sim \n2 - Não");
                        voltar1 = input.nextByte();
                        voltar = 0;
                    } while(voltar1 == 1);
                    break;
                
                case 2:
                    //dados
                    byte voltar2;
                    do{
                        System.out.println("\n##################");
                        System.out.println(u1);
                        System.out.println("##################");
                        System.out.println("Voltar? \n1 - Sim");
                        voltar2 = input.nextByte();
                    } while(voltar2 == 0);
                    voltar = 0;
                    break;
                
                case 3:
                    //loja
                    byte voltar3;
                    do{
                        switch(l1.getQuantidadeD()){
                            case 0:
                                l1.setCustoD(100);
                                break;
                            default:
                                l1.setCustoD(100 * l1.getQuantidadeD());
                        }
                        switch(l1.getQuantidadeE()){
                            case 0:
                                l1.setCustoE(200);
                                break;
                            default:
                                l1.setCustoE(200 * l1.getQuantidadeE());
                        }
                        System.out.println("\nEntrou na loja!");
                        System.out.println("Olá, aventureiro, o que deseja comprar?");
                        System.out.println("1 - Multiplicador de dinheiro(" + l1.getQuantidadeD() + ")  custo: " + l1.getCustoD() + "$");
                        System.out.println("2 - Multiplicador de experiência(" + l1.getQuantidadeE() + ")   custo: " + l1.getCustoE() + "$");
                        System.out.println("3 - Sair");
                        System.out.println("Seu saldo: " + u1.getDinheiro());
                        voltar3 = input.nextByte();
                        if (voltar3 == 1 && u1.getDinheiro() >= l1.getCustoD()){
                            System.out.println("Compra efetuada com sucesso!");
                            l1.setQuantidadeD(l1.getQuantidadeD() + 1);
                            u1.setDinheiro(u1.getDinheiro() - l1.getCustoD());
                        } else if(voltar3 == 2 && u1.getDinheiro() >= l1.getCustoE() && l1.getQuantidadeE() < 10){
                            System.out.println("Compra efetuada com sucesso!");
                            l1.setQuantidadeE(l1.getQuantidadeE() + 1);
                            u1.setDinheiro(u1.getDinheiro() - l1.getCustoE());
                        } else if(voltar3 == 2 && u1.getDinheiro() >= l1.getCustoE() && l1.getQuantidadeE() == 10){
                            System.out.println("***********************");
                            System.out.println("Limite máximo atingido!");
                            System.out.println("***********************");
                        } else if(voltar3 == 3){
                            System.out.println("Até a próxima!");
                        } else{
                            System.out.println("***********************");
                            System.out.println("Dinheiro insuficiente!");
                            System.out.println("***********************");
                        }
                    } while(voltar3 == 1 || voltar3 == 2);
                    voltar = 0;
                    break;
                
                case 4:
                    //sair
                    System.out.println("\nSaindo...");            
                    break;
                
                case 5:
                    //zerar jogo
                    if(u1.getDinheiro() >= 1000000){
                    System.out.println("\nParabéns! você zerou o jogo! \nMuito obrigado por jogar!");
                    System.out.println("Criadores: Bruno Koster e Gabriel Reus");
                    } else{
                        System.out.println("***********************");
                        System.out.println("Dinheiro insuficiente!");
                        System.out.println("***********************");
                    }
                    System.out.println("Continuar jogando? \n1 - sim \n2 - não");
                    voltar = input.nextByte();
                    if(voltar == 1){
                        voltar = 0;
                    }
                    
                    break;
                default:
                    System.out.println("\nNúmero inválido!");
                    voltar = 0;
            }
        } while(voltar == 0);
    }
}
