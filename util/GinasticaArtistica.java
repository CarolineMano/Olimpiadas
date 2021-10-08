/*Classe que implementa as decisões, regras e mensagens do arremesso de peso*/
package util;

import java.util.Scanner;
import model.AtletaGinastica;

public class GinasticaArtistica extends Modalidade{

    //Método para um atleta de ginástica ter 5 notas divulgadas
    public static void divulgarCincoNotas(AtletaGinastica atleta, Scanner entrada) {
        System.out.println("\nO atleta " + atleta.getNome() + " está se apresentando...");
        for (int i = 0; i < atleta.getResultados().length; i++) {
            System.out.print((atleta.getIndiceResultado() + 1) + "ª nota: ");
            double nota = Ferramenta.converterStringParaDouble(entrada);
            System.out.println(atleta.fazerApresentacao(nota));
        }
    }
    
    //Método estático para definir, dentre dois atletas de ginástica, o vencedor
    public static String definirVencedor(AtletaGinastica atleta1, AtletaGinastica atleta2) {
        if(atleta1.getSomatorioFinalNotas() > atleta2.getSomatorioFinalNotas()){
            return ("\nO vencedor foi o atleta " + atleta1.getNome() + ", com uma nota final de " + atleta1.getSomatorioFinalNotas());
        }
            return ("\nO vencedor foi o atleta " + atleta2.getNome() + ", com uma nota final de " + atleta2.getSomatorioFinalNotas());        
    }
}
