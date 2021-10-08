/*Classe filha AtletaGinastica
que extende a classe Atleta e implementa
outras peculiaridades*/

package model;

import java.util.Arrays;

//Classe com herança de Atleta
public class AtletaGinastica extends Atleta{
    
    //Propriedade singular do Atleta de Ginástica
    private double somatorioFinalNotas;

    //Construtor implementado a partir da classe mãe, incluindo quantidade de resultados
    public AtletaGinastica() {
        super();
        resultados = new double[5];
        somatorioFinalNotas = 0;
    }

    //Getters e setters próprios da classe
    public void setSomatorioFinalNotas(double somatorioFinal) {
        this.somatorioFinalNotas = somatorioFinal;
    }

    public double getSomatorioFinalNotas() {
        return somatorioFinalNotas;
    }

    //Método para que a apresentação seja julgada por um único juiz e dar a avaliação final após 5 notas
    public String fazerApresentacao(double notaJurado) {
        String saida = "A " + (this.getIndiceResultado() + 1) + "ª nota do atleta " + this.getNome() + " é: " + notaJurado;
        this.setResultados(notaJurado);
        if(this.getIndiceResultado() == 5) {
            double somatorioFinal;
            Arrays.sort(this.getResultados());
            somatorioFinal = (Arrays.stream(this.getResultados()).sum() - this.getResultados()[0]);
            this.setSomatorioFinalNotas(somatorioFinal);
            saida += "\nA menor nota do atleta " + this.getNome() + " foi " + this.getResultados()[0] + 
                ", sua avaliação final foi de: " + somatorioFinal;
            this.setIndiceResultado(0);
        }
        return saida;
    }
}
