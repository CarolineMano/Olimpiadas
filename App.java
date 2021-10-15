/*Classe principal para implementar a funcionalidade final das Olimpíadas*/

import java.util.Scanner;
import util.*;


public class App {
    public static void main(String[] args) {
        //Instâncias das modalidades existentes nestes jogos
        ArremessoPeso arremessoPeso = new ArremessoPeso();
        GinasticaArtistica ginasticaArtistica = new GinasticaArtistica();
        //Variável para controlar o fim do programa
        boolean fimDePrograma = true;
        //Variável de entrada de dados
        Scanner entrada = new Scanner(System.in);
        //Variável que guardará as opções do menu principal
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
                    arremessoPeso.inserirNomeAtletas(entrada);
                    arremessoPeso.fazerTresArremessos(entrada);
                    System.out.println(arremessoPeso.definirVencedor());
                    break;
                case 2:
                    //Implementação da ginástica artística
                    System.out.println("\n***GINÁSTICA ARTÍSTICA***\n");
                    ginasticaArtistica.inserirNomeAtletas(entrada);
                    ginasticaArtistica.divulgarCincoNotas(entrada);
                    System.out.println(ginasticaArtistica.definirVencedor());
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
}
