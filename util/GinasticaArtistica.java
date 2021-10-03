package util;

import java.util.Arrays;
import model.AtletaGinastica;

public class GinasticaArtistica {
    
    public static String fazerApresentacao(AtletaGinastica atleta, double notaJurado) {
        String saida = "A " + (atleta.getIndiceResultado() + 1) + "ª nota do atleta " + atleta.getNome() + " é: " + notaJurado;
        atleta.setResultados(notaJurado);
        if(atleta.getIndiceResultado() == 5) {
            double somatorioFinal;
            Arrays.sort(atleta.getResultados());
            somatorioFinal = (Arrays.stream(atleta.getResultados()).sum() - atleta.getResultados()[0]);
            atleta.setSomatorioFinalNotas(somatorioFinal);
            saida += "\nA menor nota do atleta " + atleta.getNome() + " foi " + atleta.getResultados()[0] + 
                ", sua avaliação final foi de: " + somatorioFinal;
            atleta.setIndiceResultado(0);
        }
        return saida;
    }

    public static String definirVencedor(AtletaGinastica atleta1, AtletaGinastica atleta2) {
        if(atleta1.getSomatorioFinalNotas() > atleta2.getSomatorioFinalNotas()){
            return ("\nO vencedor foi o atleta " + atleta1.getNome() + ", com uma nota final de " + atleta1.getSomatorioFinalNotas());
        }
            return ("\nO vencedor foi o atleta " + atleta2.getNome() + ", com uma nota final de " + atleta2.getSomatorioFinalNotas());        
    }
}
