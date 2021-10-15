/*Classe que implementa as decisões, regras e mensagens do arremesso de peso*/

package util;

import java.util.Arrays;
import java.util.Scanner;
import model.AtletaPeso;


public class ArremessoPeso extends Modalidade{

    //Vetor para inserir os atletas de arremesso de peso
    private AtletaPeso[] atletas;

    //Construtor
    public ArremessoPeso() {
        atletas = new AtletaPeso[2];
        atletas[0] = new AtletaPeso();
        atletas[1] = new AtletaPeso();
    }

    //Definição do método abstrato herdado da classe Modalidade para inserir nomes dos atletas
    public void inserirNomeAtletas(Scanner entrada) {
        System.out.print("O primeiro atleta a competir é: ");
        atletas[0].setNome(entrada.nextLine());
        System.out.print("O segundo atleta a competir é: ");
        atletas[1].setNome(entrada.nextLine());
    }

    //Método privado para fazer um único arremesso de um atleta da modalidade e decidir, após 3 arremessos, a melhor marca do atleta
    private String fazerArremesso(AtletaPeso atleta, double valorArremesso) {
        String saida = "O atleta " + atleta.getNome() + " faz seu " + (atleta.getIndiceResultado() + 1) + "º arremesso, " + valorArremesso + " metros\n";
        atleta.setResultados(valorArremesso);
        if(atleta.getIndiceResultado() == 3) {
            Arrays.sort(atleta.getResultados());
            saida += "O atleta " + atleta.getNome() + " teve como melhor arremesso a distância de " + atleta.getResultados()[2] + " metros\n";
            atleta.setIndiceResultado(0);
        }
        return saida;
    }

    //Definição do método abstrato herdado da classe Modalidade para definir, dentre dois atletas de peso, o vencedor
    public String definirVencedor() {
        if(atletas[0].getResultados()[2] > atletas[1].getResultados()[2]) {
            return ("O vencedor foi o atleta " + atletas[0].getNome() + ", com um arremesso de " + atletas[0].getResultados()[2] + " metros\n"); 
        }
        else if(atletas[0].getResultados()[2] < atletas[1].getResultados()[2]) {
            return ("O vencedor foi o atleta " + atletas[1].getNome() + ", com um arremesso de " + atletas[1].getResultados()[2] + " metros\n"); 
        }
        else {
            if (atletas[0].getResultados()[1] > atletas[1].getResultados()[1]) {
                return ("Após empate, foi julgado o segundo maior arremesso. Sendo assim, o atleta " + atletas[0].getNome() + " vence com o arremesso de " + 
                atletas[0].getResultados()[1] + " metros\n"); 
            }
            else {
                return ("Após empate, foi julgado o segundo maior arremesso. Sendo assim, o atleta " + atletas[1].getNome() + " vence com o arremesso de " + 
                atletas[1].getResultados()[1] + " metros\n"); 
            }
        }
    }

    //Método para os atletas de peso realizarem 3 arremessos, com auxílio do método privado fazerArremesso
    public void fazerTresArremessos(Scanner entrada) {
        for (AtletaPeso atletaPeso : atletas) {
            System.out.println("O atleta " + atletaPeso.getNome() + " irá jogar...");
            for (int i = 0; i < atletaPeso.getResultados().length; i++) {
                System.out.print((atletaPeso.getIndiceResultado() + 1) + "º arremesso: ");
                double arremesso = Ferramenta.converterStringParaDouble(entrada);
                System.out.println(fazerArremesso(atletaPeso, arremesso));
            }
        }
    }

}
