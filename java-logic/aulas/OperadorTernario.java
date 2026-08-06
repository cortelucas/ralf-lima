public class OperadorTernario {
    public static void main(String[] args) {
        double nota = 5.5;

        // Aprovado, Recuperação ou Reprovado
        String mensagem = nota >= 7 ? "Aprovado" : (nota >= 5 ? "Recuperação" : "Reprovado");

        System.out.println(mensagem);
    }
}
