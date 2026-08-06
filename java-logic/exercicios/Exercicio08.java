/*
    Peça um número, em seguida exiba a tabuada.
*/

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número para exibir a tabuada: ");
        int numero = scanner.nextInt();

        scanner.close();

        System.out.println("Tabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        // while
        int i = 1;
        System.out.println("\nTabuada do " + numero + " (usando while):");
        while (i <= 10) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
            i++;
        }
    }    
}
