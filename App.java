/*Classe principal para implementar a funcionalidade final das Olimpíadas*/

import java.util.Scanner;
import model.*;
import util.*;


public class App {
    public static void main(String[] args) {
        //Declaração de variáveis locais
        AtletaPeso atletaPeso1 = new AtletaPeso();
        AtletaPeso atletaPeso2 = new AtletaPeso();
        AtletaGinastica atletaGinastica1 = new AtletaGinastica();
        AtletaGinastica atletaGinastica2 = new AtletaGinastica();
        boolean fimDePrograma = true;
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        System.out.println("***Bem vindo às Olimpíadas***");

        //Loop do Menu de escolha de modalidades 
        do {
            System.out.println("\nEscolha um dos esportes abaixo: ");
            System.out.println("1 - Arremesso de Peso");
            System.out.println("2 - Ginástica Artística");
            System.out.println("3 - Ir embora");
            System.out.print("Opção: ");

            //Define a entrada do usuário em número inteiro
            opcao = Ferramenta.converterStringParaInt(entrada);

            switch (opcao) {
                case 1:
                    //Implementação do arremesso de peso
                    System.out.println("\n***ARREMESSO DE PESO***\n");
                    inserirNomeAtletas(atletaPeso1, atletaPeso2, entrada);

                    fazerTresArremessos(atletaPeso1, entrada);
                    fazerTresArremessos(atletaPeso2, entrada);
            
                    System.out.println(ArremessoPeso.definirVencedor(atletaPeso1, atletaPeso2));
                    break;
                case 2:
                    //Implementação da ginástica artística
                    System.out.println("\n***GINÁSTICA ARTÍSTICA***\n");
                    inserirNomeAtletas(atletaGinastica1, atletaGinastica2, entrada);

                    divulgarCincoNotas(atletaGinastica1, entrada);
                    divulgarCincoNotas(atletaGinastica2, entrada);

                    System.out.println(GinasticaArtistica.definirVencedor(atletaGinastica1, atletaGinastica2));

                    break;
                case 3:
                    //Alteração da variável que termina o programa
                    System.out.println("Obrigado por participar dos Jogos Olímpicos. Até a próxima!");
                    fimDePrograma = false;
                    break;
                default:
                    //Opção inválida
                    System.out.println("Desculpe-nos, mas só conseguimos atletas para dois esportes! Escolha outra opção");
                    break;
            }

        } while (fimDePrograma);

    }

    //Método para o nome dos atletas
    public static void inserirNomeAtletas(Atleta atleta1, Atleta atleta2, Scanner entrada) {
        System.out.print("O primeiro atleta a competir é: ");
        atleta1.setNome(entrada.nextLine());
        System.out.print("O segundo atleta a competir é: ");
        atleta2.setNome(entrada.nextLine());
    }
    
    //Método para um atleta de peso realizar 3 arremessos
    public static void fazerTresArremessos(AtletaPeso atleta, Scanner entrada) {
        System.out.println("O atleta " + atleta.getNome() + " irá jogar...");
        for (int i = 0; i < atleta.getResultados().length; i++) {
            System.out.print((atleta.getIndiceResultado() + 1) + "º arremesso: ");
            double arremesso = Ferramenta.converterStringParaDouble(entrada);
            System.out.println(ArremessoPeso.fazerArremesso(atleta, arremesso));
        }
    }

    //Método para um atleta de ginástica ter 5 notas divulgadas
    public static void divulgarCincoNotas(AtletaGinastica atleta, Scanner entrada) {
        System.out.println("\nO atleta " + atleta.getNome() + " está se apresentando...");
        for (int i = 0; i < atleta.getResultados().length; i++) {
            System.out.print((atleta.getIndiceResultado() + 1) + "ª nota: ");
            double nota = Ferramenta.converterStringParaDouble(entrada);
            System.out.println(GinasticaArtistica.fazerApresentacao(atleta, nota));
        }
    }

}
