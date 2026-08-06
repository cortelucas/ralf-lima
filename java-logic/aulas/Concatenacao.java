public class Concatenacao {
    public static void main(String[] args) {
        String nome = "Lucas";
        int idade = 32;
        
        System.out.println("Olá, meu nome é " + nome + " e tenho " + idade + " anos.");

        System.out.println(String.format("Olá, meu nome é %s e tenho %d anos.", nome, idade));

        System.out.printf("Olá, meu nome é %s e tenho %d anos.", nome, idade);
    }
}
