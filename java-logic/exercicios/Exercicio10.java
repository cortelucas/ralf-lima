/*
    Crie um vetor contendo três posições vazias.

    Em seguida crie um laço de repetição para pedir três nomes e armazenar no vetor.

    Após executar o laço, exiba os nomes contidos no vetor.
*/

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[3];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        scanner.close();

        System.out.println("\nNomes digitados:");
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }
    }    
}
