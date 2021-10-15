/*Classe que implementa as decisões, regras e mensagens do arremesso de peso*/
package util;

import java.util.Arrays;
import java.util.Scanner;
import model.AtletaGinastica;

public class GinasticaArtistica extends Modalidade{
    
    //Vetor para inserir os atletas de ginástica artística
    private AtletaGinastica[] atletas;

    //Construtor
    public GinasticaArtistica() {
        atletas = new AtletaGinastica[2];
        atletas[0] = new AtletaGinastica();
        atletas[1] = new AtletaGinastica();
    }

    //Definição do método abstrato herdado da classe Modalidade para inserir nomes dos atletas
    public void inserirNomeAtletas(Scanner entrada) {
        System.out.print("O primeiro atleta a competir é: ");
        atletas[0].setNome(entrada.nextLine());
        System.out.print("O segundo atleta a competir é: ");
        atletas[1].setNome(entrada.nextLine());
    }

    //Método para que a apresentação seja julgada por um único juiz e dar a avaliação final após 5 notas
    private String fazerApresentacao(AtletaGinastica atleta, double notaJurado) {
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

    //Definição do método abstrato herdado da classe Modalidade para definir, dentre dois atletas de ginástica, o vencedor
    public String definirVencedor() {
        if(atletas[0].getSomatorioFinalNotas() > atletas[1].getSomatorioFinalNotas()){
            return ("\nO vencedor foi o atleta " + atletas[0].getNome() + ", com uma nota final de " + atletas[0].getSomatorioFinalNotas());
        }
            return ("\nO vencedor foi o atleta " + atletas[1].getNome() + ", com uma nota final de " + atletas[1].getSomatorioFinalNotas());        
    }

    //Método para os atletas de ginástica terem 5 notas divulgadas, com auxílio do método privado fazerApresentacao
    public void divulgarCincoNotas(Scanner entrada) {
        for (AtletaGinastica atletaGinastica : atletas) {
            System.out.println("\nO atleta " + atletaGinastica.getNome() + " está se apresentando...");
            for (int i = 0; i < atletaGinastica.getResultados().length; i++) {
                System.out.print((atletaGinastica.getIndiceResultado() + 1) + "ª nota: ");
                double nota = Ferramenta.converterStringParaDouble(entrada);
                System.out.println(fazerApresentacao(atletaGinastica, nota));
            }
        }    
    }

}
