/*
    Crie uma matriz 3x2 vazia.

    Em um laço de repetição, peça três estados e três cidades.

    Armazene cada informação em uma posição da matriz.

    Exiba os valores contidos na matriz.
*/

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[][] localidades = new String[3][2];

        for (int i = 0; i < localidades.length; i++) {
            System.out.print("Digite o estado " + (i + 1) + ": ");
            localidades[i][0] = scanner.nextLine();
            System.out.print("Digite a cidade " + (i + 1) + ": ");
            localidades[i][1] = scanner.nextLine();
        }

        scanner.close();

        System.out.println("\nLocalidades digitadas:");
        for (int i = 0; i < localidades.length; i++) {
            System.out.println("Estado: " + localidades[i][0] + ", Cidade: " + localidades[i][1]);
        }
    }    
}
