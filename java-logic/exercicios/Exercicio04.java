/*
    Crie um conversor de moedas.

    O cliente informa o tipo de conversão e o valor.

    Opções para conversão:
    1 - Dólar para Real.
    2 - Real para Dólar.
    3 - Euro para Real.
    4 - Real para Euro.

    Cotação sugerida:
    1 Dólar = R$5,50
    1 Euro  = R$6,00
*/

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        menu();

        System.out.print("Opção: ");
        String opcao = scanner.nextLine();

        System.out.print("Valor: ");
        double valor = scanner.nextDouble();

        scanner.close();

        // retorna numero com duas casas decimais
        switch (opcao) {
            case "1":
                System.out.println("\nDólar para Real: " + valor + " USD = R$" + Math.round(valor * 5.50));
                break;
            case "2":
                System.out.println("\nReal para Dólar: R$" + valor + " = " + Math.round(valor / 5.50 * 100.0) / 100.0 + " USD");
                break;
            case "3":
                System.out.println("\nEuro para Real: " + valor + " EUR = R$" + Math.round(valor * 6.00));
                break;
            case "4":
                System.out.println("\nReal para Euro: R$" + valor + " = " + Math.round(valor / 6.00 * 100.0) / 100.0 + " EUR");
                break;
            default:
                System.out.println("\nOpção inválida.");
        }
    }

    private static void menu() {
        System.out.println("Escolha a opção de conversão:");
        System.out.println("1 - Dólar para Real");
        System.out.println("2 - Real para Dólar");
        System.out.println("3 - Euro para Real");
        System.out.println("4 - Real para Euro");
    }
}
