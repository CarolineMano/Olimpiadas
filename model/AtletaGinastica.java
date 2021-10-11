/*Classe filha AtletaGinastica
que extende a classe Atleta e implementa
outras peculiaridades*/

package model;

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
}
