/*Classe filha AtletaPeso
que extende a classe Atleta*/

package model;

//Classe com herança de Atleta
public class AtletaPeso extends Atleta {
    
    //Construtor implementado a partir da classe mãe, incluindo quantidade de arremessos
    public AtletaPeso() {
        super();
        resultados = new double[3];
    }

}
