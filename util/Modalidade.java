package util;

import model.Atleta;
import java.util.Scanner;

public class Modalidade {
    
    //Método para o nome dos atletas
    public static void inserirNomeAtletas(Atleta atleta1, Atleta atleta2, Scanner entrada) {
        System.out.print("O primeiro atleta a competir é: ");
        atleta1.setNome(entrada.nextLine());
        System.out.print("O segundo atleta a competir é: ");
        atleta2.setNome(entrada.nextLine());
    }
}
