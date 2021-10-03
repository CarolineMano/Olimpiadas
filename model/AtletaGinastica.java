package model;

public class AtletaGinastica extends Atleta{
    
    private double somatorioFinalNotas;

    public AtletaGinastica() {
        super();
        resultados = new double[5];
        somatorioFinalNotas = 0;
    }

    public void setSomatorioFinalNotas(double somatorioFinal) {
        this.somatorioFinalNotas = somatorioFinal;
    }

    public double getSomatorioFinalNotas() {
        return somatorioFinalNotas;
    }
}
