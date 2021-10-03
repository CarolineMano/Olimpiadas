package util;

import java.util.Arrays;
import model.AtletaPeso;


public class ArremessoPeso {

    public static String fazerArremesso(AtletaPeso atleta, double valorArremesso) {
        String saida = "O atleta " + atleta.getNome() + " faz seu " + (atleta.getIndiceResultado() + 1) + "º arremesso, " + valorArremesso + " metros\n";
        atleta.setResultados(valorArremesso);
        if(atleta.getIndiceResultado() == 3) {
            Arrays.sort(atleta.getResultados());
            saida += "O atleta " + atleta.getNome() + " teve como melhor arremesso a distância de " + atleta.getResultados()[2] + " metros\n";
            atleta.setIndiceResultado(0);
        }
        return saida;
    }

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

}
