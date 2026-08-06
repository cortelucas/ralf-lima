public class Condicional {
    public static void main(String[] args) {
        double nota = 6.5;

        if (nota >= 7) {
            System.out.println("Aprovado");
        } else if (nota >= 5) {
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }

        int idade = 17;
        boolean maiorDeIdade = idade >= 18;

        if (maiorDeIdade) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}
