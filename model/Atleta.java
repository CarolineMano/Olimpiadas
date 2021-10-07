/*Classe mãe, abstrata, Atleta
para ser utilizada pelas classes AtletaGinastica
e AtletaPeso*/

package model;

public abstract class Atleta {
    //Propriedades
    protected String nome;
    protected double[] resultados;
    protected int indiceResultado;

    //Construtor
    public Atleta() {
        indiceResultado = 0;
    }

    //Getters e setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setResultados(double valor) {
        resultados[indiceResultado] = valor;
        indiceResultado++;        
    }

    public void setResultados(double[] resultadosOrdenados) {
        for (int i = 0; i < resultados.length; i++) {
            resultados[i] = resultadosOrdenados[i];
        }
    }

    public double[] getResultados() {
        return resultados;
    }

    public int getIndiceResultado() {
        return indiceResultado;
    }

    public void setIndiceResultado(int novoIndice) {
        indiceResultado = novoIndice;
    }

}