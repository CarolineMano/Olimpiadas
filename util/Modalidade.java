package util;

import java.util.Scanner;

public abstract class Modalidade {
    
    //Método para o nome dos atletas
    public abstract void inserirNomeAtletas(Scanner entrada);

    //Método para definir o vencedor naquela modalidade
    public abstract String definirVencedor();
}
