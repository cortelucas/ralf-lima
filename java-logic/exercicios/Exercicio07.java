/*
    Peça diversos números, até que seja informado zero.

    Após informar o número zero, exiba a soma de todos os números.
*/

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int numero;

        do {
            System.out.print("Digite um número (ou 0 para sair): ");
            numero = scanner.nextInt();
            soma += numero;
        } while (numero != 0);

        scanner.close();

        System.out.println("A soma de todos os números é: " + soma);

    }
}
