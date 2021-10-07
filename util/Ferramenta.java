/*Classe com ferramentas para lidar com exceções que podem ser causadas
na entrada do usuário*/

package util;

import java.util.Scanner;


public class Ferramenta {
    
    //Método estático para converter a entrada em um int, lidando com erros
    public static int converterStringParaInt (Scanner entrada) {
        boolean continueLoop = true;
        String opcaoComoString;
        int opcaoComoInt = 0;
        do {
            opcaoComoString = entrada.nextLine();
            try {
                opcaoComoInt = Integer.parseInt(opcaoComoString);
                continueLoop = false;
            } catch (Exception e) {
                System.out.println("Você não digitou um número! Digite novamente.");
                continueLoop = true;
            }
        } while (continueLoop);
        return opcaoComoInt;
    }

    //Método estático para converter a entrada em um double, lidando com erros
    public static double converterStringParaDouble (Scanner entrada) {
        boolean continueLoop = true;
        String opcaoComoString;
        double opcaoComoDouble = 0;
        do {
            opcaoComoString = entrada.nextLine();
            try {
                opcaoComoDouble = Double.parseDouble(opcaoComoString);
                continueLoop = false;
            } catch (Exception e) {
                System.out.println("Você não digitou um número! Digite novamente.");
                continueLoop = true;
            }
        } while (continueLoop);
        return opcaoComoDouble;
    }
}