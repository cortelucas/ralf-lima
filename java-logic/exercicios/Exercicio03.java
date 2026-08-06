/*
    Peça dois números inteiros.

    Se forem iguais, faça a soma, caso contrário faça a multiplicação.
*/

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        scanner.close();

        if (num1 == num2) {
            System.out.println("\nOs números são iguais. Soma: " + num1 + " + " + num2 + " = " + (num1 + num2));
        } else {
            System.out.println("\nOs números são diferentes. Multiplicação: " + num1 + " x " + num2 + " = " + (num1 * num2));
        }

    }    
}
