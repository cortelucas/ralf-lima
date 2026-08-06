package Collections;
import java.util.Scanner;

public class TratamentoErros {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite um número inteiro: ");
            int numero = scanner.nextInt();

            System.out.println("Você digitou: " + numero);
        } catch (Exception error) {
            System.out.println("Erro: " + error.getMessage());
        } finally {
            scanner.close();
        }
    }
}
