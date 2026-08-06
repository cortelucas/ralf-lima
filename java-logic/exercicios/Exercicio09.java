/*
    Crie um vetor contendo os números: 5, 8, 3, 1, 9.

    Implemente um laço de repetição para percorrer cada posição e contabilizar
    a quantidade de pares e ímpares.

    Em seguida exiba suas respectivas quantidades.
*/

public class Exercicio09 {
    public static void main(String[] args) {
        
        int[] numeros = {5, 8, 3, 1, 9};
        int quantidadePares = 0;
        int quantidadeImpares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                quantidadePares++;
            } else {
                quantidadeImpares++;
            }
        }

        System.out.println("Quantidade de números pares: " + quantidadePares);
        System.out.println("Quantidade de números ímpares: " + quantidadeImpares);
    }
}
