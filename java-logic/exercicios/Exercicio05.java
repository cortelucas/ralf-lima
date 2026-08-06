/*
    Peça dois números inteiros e um tipo de cálculo.

    As opções de cálculos são:
    1 - Somar
    2 - Subtrair
    3 - Multiplicar
    4 - Dividir

    Em seguida, retorne o valor.
*/

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        menu();

        System.out.print("Opção: ");
        String opcao = scanner.nextLine();

        System.out.print("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        scanner.close();

        // Usando switch expressions
        switch (opcao) {
            case "1" -> System.out.println("\nSoma: " + num1 + " + " + num2 + " = " + (num1 + num2));
            case "2" -> System.out.println("\nSubtração: " + num1 + " - " + num2 + " = " + (num1 - num2));
            case "3" -> System.out.println("\nMultiplicação: " + num1 + " x " + num2 + " = " + (num1 * num2));
            case "4" -> {
                if (num2 == 0) {
                    System.out.println("\nDivisão por zero não é permitida.");
                } else {
                    System.out.println("\nDivisão: " + num1 + " / " + num2 + " = " + ((double) num1 / num2));
                }
            }
            default -> System.out.println("\nOpção inválida.");
        }
    }

    private static void menu() {
        System.out.println("Escolha a opção de cálculo:");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
    }
}
