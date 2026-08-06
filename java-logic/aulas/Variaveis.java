/* 
*Variáveis
* 1 - Não pode conter caracteres especiais, exceto o underline (_)
* 2 - Não pode começar com números
* 3 - Não pode conter espaços
* 4 - As variáveis devem ser escritas em letras minúsculas (camelCase)
* 5 - Não pode ser uma palavra reservada do Java
*/

public class Variaveis {
    public static void main(String[] args) {
        // Declarando texto
        String nome = "Lucas";
        
        // Declarando texto unico (char)
        char sexo = 'M';

        // Declarando inteiro
        int idade = 32;
        
        // Declarando decimal
        double altura = 1.83;

        // Declarando booleano
        boolean estudante = true;

        var interpolacaoDoTexto = "Olá, meu nome é " + nome + ", tenho " + idade + " anos, sou do sexo " + sexo + ", minha altura é " + altura + (estudante ? " e sou estudante." : " e não sou estudante.");

        System.out.println(interpolacaoDoTexto);
        
    }
}
