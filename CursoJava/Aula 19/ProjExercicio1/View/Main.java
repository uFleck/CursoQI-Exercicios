package View;

import Model.Contato;
import java.util.Scanner;
import Model.Cadastro;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cadastro c1 = new Cadastro();
        
        System.out.println("------------------");
        System.out.println("Seja bem-vindo(a)!");
        System.out.println("------------------");
        byte voltar = 1;
        do{
            System.out.println("\n1- Cadastre contato\n" +
                               "2- Ver contatos\n" +
                               "3- Ver Quantidade de Contatos cadastrados\n" +
                               "4- Remover um contato\n" +
                               "5- Pesquisar Contato pelo telefone celular\n" +
                               "0- Sair");
            byte op = in.nextByte();
            
            switch(op){
                case 1:
                    Contato c = new Contato();
                    
                    System.out.println("\nDigite o código do contato: ");
                    c.setCodigo(in.nextInt());
                    
                    System.out.println("Digite o nome:");
                    in.nextLine();
                    c.setNome(in.nextLine());
                    
                    System.out.println("Digite o telefone celular: ");
                    c.setTelCelular(in.nextInt());
                    
                    System.out.println("Digite o telefone residencial: ");
                    c.setTelResidencial(in.nextInt());
                    
                    System.out.println("Digite o e-mail: ");
                    in.nextLine();
                    c.setEmail(in.nextLine());
                    
                    c1.cadastrar(c);
                    
                    break;
                    
                case 2:
                    if(c1.getLista().isEmpty()){
                        System.out.println("\nNão há contatos cadastrados!");
                    } else{
                        System.out.println("");
                        System.out.println(c1);
                    }
                    break;
                    
                case 3:
                    System.out.println("\nQuantidade de contatos cadastrados: " + c1.verQuantidade());
                    break;
                    
                case 4:
                    if(c1.getLista().isEmpty()){
                        System.out.println("\nNão há contatos cadastrados!");
                    } else{
                        System.out.println("\nDigite o código do contato que você quer excluir:");
                        int codigo = in.nextInt();

                        Contato encontrado = c1.pesquisarContato(codigo);
                        if(encontrado == null){
                            System.out.println("Nenhum contato foi encontrado.");
                        } else{
                            System.out.println("Tem certeza de que quer excluir este contato?"
                                              + "\n1 - Sim          2 - Não");
                            byte opEx = in.nextByte();

                            if(opEx == 1){
                                c1.excluir(encontrado);
                                System.out.println("Excluido com sucesso.");
                            } else{
                                System.out.println("Operação cancelada.");
                            }
                        }
                    }
                    break;
                    
                case 5:
                    if(c1.getLista().isEmpty()){
                        System.out.println("\nNão há contatos cadastrados!");
                    } else{
                        System.out.println("\nDigite o telefone celular do contato para pesquisarmos:");
                        int telCelular = in.nextInt();
                        Contato achei = c1.pesquisarContato(telCelular);
                        if(achei == null){
                            System.out.println("Nenhum contato foi encontrado!");
                        } else{
                            System.out.println("Contato encontrado!");
                            System.out.println(achei);
                        }
                    }
                    break;
                    
                case 0:
                    System.out.println("Tchau, Tchau!");
                    voltar = 0;
                    break;
                    
                default:
                    System.out.println("Número inválido!");
            }
        } while(voltar != 0);
    }
}
