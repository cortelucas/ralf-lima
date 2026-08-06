/*
    Peça três números inteiros, exiba o menor
*/

import java.util.Scanner;

public class Exercicio02 {
 
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // int menor = Math.min(num1, Math.min(num2, num3)); // Alternativa usando Math.min
        int menor = num1;

        if (num2 < menor) {
            menor = num2;
        }

        if (num3 < menor) {
            menor = num3;
        }

        scanner.close();
        
        System.out.println("\nMenor: " + menor);

    }
}
