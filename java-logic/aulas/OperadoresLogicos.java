// TABELA VERDADE - E
// Verdadeiro e Verdadeiro = Verdadeiro
// Verdadeiro e Falso = Falso
// Falso e Verdadeiro = Falso
// Falso e Falso = Falso

// TABELA VERDADE - OU
// Verdadeiro ou Verdadeiro = Verdadeiro
// Verdadeiro ou Falso = Verdadeiro
// Falso ou Verdadeiro = Verdadeiro
// Falso ou Falso = Falso

// TABELA VERDADE - NÃO
// NÃO Verdadeiro = Falso
// NÃO Falso = Verdadeiro


public class OperadoresLogicos {
    public static void main(String[] args) {
        String formaPagamento = "à vista";
        double valor = 200.0;

        System.out.println(formaPagamento == "à vista" && valor >= 100.0); // true
    }
}
