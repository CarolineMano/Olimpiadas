import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        AtletaPeso atleta1 = new AtletaPeso();
        AtletaPeso atleta2 = new AtletaPeso();
        boolean fimDePrograma = true;
        Scanner entrada = new Scanner(System.in);
        int opcao = 0;

        System.out.println("***Bem vindo às Olimpíadas***");

        do {
            System.out.println("\nEscolha um dos esportes abaixo: ");
            System.out.println("1 - Arremesso de Peso");
            System.out.println("2 - Ginástica Artística");
            System.out.println("3 - Ir embora");
            System.out.print("Opção: ");

            opcao = Ferramenta.converterStringParaInt(entrada);

            switch (opcao) {
                case 1:
                    System.out.print("O primeiro atleta a competir é: ");
                    atleta1.setNome(entrada.nextLine());
                    System.out.print("O segundo atleta a competir é: ");
                    atleta2.setNome(entrada.nextLine());

                    fazerTresArremessos(atleta1, entrada);
                    fazerTresArremessos(atleta2, entrada);
            
                    System.out.println(ArremessoPeso.definirVencedor(atleta1, atleta2));
                    break;
            
                case 3:
                    System.out.println("Obrigado por participar dos Jogos Olímpicos. Até a próxima!");
                    fimDePrograma = false;
                    break;
                default:
                    System.out.println("Desculpe-nos, mas só conseguimos atletas para dois esportes! Escolha outra opção");
                    break;
            }

        } while (fimDePrograma);

    }

    public static void fazerTresArremessos(AtletaPeso atleta, Scanner entrada) {
        System.out.println("O atleta " + atleta.getNome() + " irá jogar...");
        for (int i = 0; i < atleta.getResultados().length; i++) {
            System.out.print((atleta.getIndiceResultado() + 1) + "º arremesso: ");
            double arremesso = Ferramenta.converterStringParaDouble(entrada);
            System.out.println(ArremessoPeso.fazerArremesso(atleta, arremesso));
        }
    }
}
