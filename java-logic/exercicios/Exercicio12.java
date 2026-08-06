/*
    Crie uma matriz 3x3.

    Essa matriz terá os seguintes números:
    4 6 8
    9 1 3
    2 7 5

    Exiba a matriz.
    Exiba a soma de todos os valores contidos na matriz.
*/

public class Exercicio12 {
    public static void main(String[] args) {
    
        int[][] matriz = {
            {4, 6, 8},
            {9, 1, 3},
            {2, 7, 5}
        };
        
        int soma = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
                soma += matriz[i][j];
            }
            System.out.println();
        }

        System.out.println("\nSoma: " + soma);

    }
}
