/* 
    Peça duas notas, exiba a média e a situação.

    Situação
    0 - 4.9 = Reprovado
    5 - 6.9 = Recuperação
    7 - 10 = Aprovado
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        
        System.out.print("\nDigite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double media = Math.round((nota1 + nota2) / 2 * 100.0) / 100.0;

        String situacao = (media < 5) ? "Reprovado" : (media < 7) ? "Recuperação" : "Aprovado";

        scanner.close();

        System.out.println("\nAluno: \t\t" + nome);
        System.out.println("Média: \t\t" + media);
        System.out.println("Situação: \t" + situacao);
    }
}
