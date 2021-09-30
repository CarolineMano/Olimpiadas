public abstract class Atleta {
    protected String nome;
    protected double[] resultados;
    protected int indiceResultado;

    public Atleta() {
        indiceResultado = 0;
    }

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