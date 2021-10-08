/*Classe filha AtletaPeso
que extende a classe Atleta*/

package model;

import java.util.Arrays;

//Classe com herança de Atleta
public class AtletaPeso extends Atleta {
    
    //Construtor implementado a partir da classe mãe, incluindo quantidade de arremessos
    public AtletaPeso() {
        super();
        resultados = new double[3];
    }

    //Método para fazer um único arremesso de um atleta da modalidade e decidir, após 3 arremessos, a melhor marca do atleta
    public String fazerArremesso(double valorArremesso) {
        String saida = "O atleta " + this.getNome() + " faz seu " + (this.getIndiceResultado() + 1) + "º arremesso, " + valorArremesso + " metros\n";
        this.setResultados(valorArremesso);
        if(this.getIndiceResultado() == 3) {
            Arrays.sort(this.getResultados());
            saida += "O atleta " + this.getNome() + " teve como melhor arremesso a distância de " + this.getResultados()[2] + " metros\n";
            this.setIndiceResultado(0);
        }
        return saida;
    }

}
