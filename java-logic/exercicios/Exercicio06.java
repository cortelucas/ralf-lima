/*
    Informe o código do produto e a quantidade, em seguida retorne o total a pagar.

    Produtos:
    1 | Camisa Masculina Azul   | R$59,90
    2 | Calça Jeans Feminina    | R$129,90
    3 | Bermuda Masculina       | R$79,90
    4 | Blusa Feminina Amarela  | R$57,70
    5 | Camisa Masculina Verde  | R$64,90
*/

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        menu();

        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();

        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();

        scanner.close();

        switch (codigo) {
            case 1:
                System.out.println("Camisa Masculina Azul - R$59,90");
                System.out.println("Total a pagar: R$" + String.format("%.2f", 59.90 * quantidade));
                break;
            case 2:
                System.out.println("Calça Jeans Feminina - R$129,90");
                System.out.println("Total a pagar: R$" + String.format("%.2f", 129.90 * quantidade));
                break;
            case 3:
                System.out.println("Bermuda Masculina - R$79,90");
                System.out.println("Total a pagar: R$" + String.format("%.2f", 79.90 * quantidade));
                break;
            case 4:
                System.out.println("Blusa Feminina Amarela - R$57,70");
                System.out.println("Total a pagar: R$" + String.format("%.2f", 57.70 * quantidade));
                break;
            case 5:
                System.out.println("Camisa Masculina Verde - R$64,90");
                System.out.println("Total a pagar: R$" + String.format("%.2f", 64.90 * quantidade));
                break;
        
            default:
                System.out.println("Código de produto inválido.");
        }
    }

    private static void menu() {
        System.out.println("Produtos:");
        System.out.println("1 | Camisa Masculina Azul   | R$59,90");
        System.out.println("2 | Calça Jeans Feminina    | R$129,90");
        System.out.println("3 | Bermuda Masculina       | R$79,90");
        System.out.println("4 | Blusa Feminina Amarela  | R$57,70");
        System.out.println("5 | Camisa Masculina Verde  | R$64,90");
    }
}
