/*Classe que implementa as decisões, regras e mensagens do arremesso de peso*/

package util;

import java.util.Scanner;
import model.AtletaPeso;


public class ArremessoPeso extends Modalidade{

    //Método estático para definir, dentre dois atletas de peso, o vencedor
    public static String definirVencedor(AtletaPeso atleta1, AtletaPeso atleta2) {
        if(atleta1.getResultados()[2] > atleta2.getResultados()[2]) {
            return ("O vencedor foi o atleta " + atleta1.getNome() + ", com um arremesso de " + atleta1.getResultados()[2] + " metros\n"); 
        }
        else if(atleta1.getResultados()[2] < atleta2.getResultados()[2]) {
            return ("O vencedor foi o atleta " + atleta2.getNome() + ", com um arremesso de " + atleta2.getResultados()[2] + " metros\n"); 
        }
        else {
            if (atleta1.getResultados()[1] > atleta2.getResultados()[1]) {
                return ("Após empate, foi julgado o segundo maior arremesso. Sendo assim, o atleta " + atleta1.getNome() + " vence com o arremesso de " + 
                atleta1.getResultados()[1] + " metros\n"); 
            }
            else {
                return ("Após empate, foi julgado o segundo maior arremesso. Sendo assim, o atleta " + atleta2.getNome() + " vence com o arremesso de " + 
                atleta2.getResultados()[1] + " metros\n"); 
            }
        }
    }

    //Método para um atleta de peso realizar 3 arremessos
    public static void fazerTresArremessos(AtletaPeso atleta, Scanner entrada) {
        System.out.println("O atleta " + atleta.getNome() + " irá jogar...");
        for (int i = 0; i < atleta.getResultados().length; i++) {
            System.out.print((atleta.getIndiceResultado() + 1) + "º arremesso: ");
            double arremesso = Ferramenta.converterStringParaDouble(entrada);
            System.out.println(atleta.fazerArremesso(arremesso));
        }
    }

}
