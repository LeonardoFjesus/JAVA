package Jogos;

import java.util.Random;
import java.util.Scanner;
public class PedraPapelTesoura {
 public static String opcaoUsuario (int usuario){
    //Pedra == 1 
    //Papel == 2
    //Tesoura == 3 
    String opcao = "";
    if (usuario == 1){
        opcao ="Pedra";   
    }else if (usuario == 2){
        opcao = "Papel";
    }else{
        opcao = "Tesoura";
    }
    return opcao;
 }
 public static String opcaoComputador (int computador){
    //Pedra == 1 
    //Papel == 2
    //Tesoura == 3 
     String opcao = "";
     if (computador == 1){
         opcao = "Pedra";
     }else if (computador == 2){
         opcao = "Papel";
     }else{
         opcao = "Tesoura";
     }
     return opcao;
    }
    public static void main (String args []){
    Random gerador = new Random();
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("\nVamos iniciar o Jogo !" );
    System.out.println("\nDigite :"+"\n"+ 
    "[1] - para inciar o jogo" +"\n"+
    "[0] - para sair !");
    int user = scanner.nextInt();
    while (user != 0) {
        System.out.println("Escolha uma das opções a baixo !"+"\n"+
        "[1] - Pedra"+"\n"+
        "[2] - Papel"+"\n"+
        "[3] - Tesoura");
        int usuario = scanner.nextInt();
        int compt = gerador.nextInt(3)+1;
        String jogadaUsuario = opcaoUsuario (usuario);
        String jogadaComputador = opcaoComputador (compt);
        if (usuario == 1){
            if (usuario == compt){
                
                System.out.println("\nEMPATE !"+"\n"+
                "Sua escolha foi : "+ jogadaUsuario +"\n"+
                "O computador escolheu : "+ jogadaComputador);
            }
             else if (compt == 2){
                System.out.println("Você perdeu"+"\n"+
                "Sua escolha foi : "+ jogadaUsuario +"\n"+
                "O computador escolheu : "+ jogadaComputador);
            }else {
                System.out.println("Você ganhou !"+"\n"+
                "Sua escolha foi : "+ jogadaUsuario +"\n"+
                "O computador escolheu : "+ jogadaComputador);
            }
            System.out.println("\nGostaria de continuar Jogando ?"+"\n"+
            "Pressione [1] - se for SIM !"+"\n"+
            "Pressione [0] - se for NÃO!");
            user = scanner.nextInt();
            
        }
        
        else if (usuario == 2){
            if (usuario == compt){
                System.out.println("Empatou"+"\n"+
                "Sua escolha foi : "+ jogadaUsuario +"\n"+
                "O computador escolheu : "+ jogadaComputador);
                
            }else if (compt == 3 ){
                System.out.println("Você perdeu"+"\n"+
                "Sua escolha foi : "+ jogadaUsuario +"\n"+
                "O computador escolheu : "+ jogadaComputador);
            }else {
                System.out.println("Você ganhou !"+"\n"+
                "Sua escolha foi : "+ jogadaUsuario +"\n"+
                "O computador escolheu : "+ jogadaComputador);
            }
             System.out.println("\nGostaria de continuar Jogando ?"+"\n"+
            "Pressione [1] - se for SIM !"+"\n"+
            "Pressione [0] - se for NÃO!");
            user = scanner.nextInt();
        }
        else if (usuario == 3){
             if (usuario == compt){
                System.out.println("Empatou"+"\n"+
                "Sua escolha foi : "+ jogadaUsuario +"\n"+
                "O computador escolheu : "+ jogadaComputador);
             }else if (compt == 1){   
             System.out.println("Você perdeu"+"\n"+
             "Sua escolha foi : "+ jogadaUsuario +"\n"+
             "O computador escolheu : "+ jogadaComputador);
             }
             else {
                System.out.println("Você ganhou !"+"\n"+
                "Sua escolha foi : "+ jogadaUsuario +"\n"+
                "O computador escolheu : "+ jogadaComputador);
             } 
              System.out.println("\nGostaria de continuar Jogando ?"+"\n"+
            "Pressione [1] - se for SIM !"+"\n"+
            "Pressione [0] - se for NÃO!");
            user = scanner.nextInt();
        }
        else {
            System.out.println("Opção inválida ! ");
        }

    }
     System.out.printf("Obrigado saindo...");
  } 
}