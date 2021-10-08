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
                    ArremessoPeso.inserirNomeAtletas(atletaPeso1, atletaPeso2);

                    ArremessoPeso.fazerTresArremessos(atletaPeso1, entrada);
                    ArremessoPeso.fazerTresArremessos(atletaPeso2, entrada);
            
                    System.out.println(ArremessoPeso.definirVencedor(atletaPeso1, atletaPeso2));
                    break;
                case 2:
                    //Implementação da ginástica artística
                    System.out.println("\n***GINÁSTICA ARTÍSTICA***\n");
                    GinasticaArtistica.inserirNomeAtletas(atletaGinastica1, atletaGinastica2);

                    GinasticaArtistica.divulgarCincoNotas(atletaGinastica1, entrada);
                    GinasticaArtistica.divulgarCincoNotas(atletaGinastica2, entrada);

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

}
