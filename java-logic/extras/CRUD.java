import java.util.ArrayList;
import java.util.Scanner;

public class CRUD {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> nomes = new ArrayList<>();

        int opcao;
        menu();

        do {
            System.out.print("Escolha uma opção (1-4) ou 0 para sair: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consome o newline deixado por nextInt()

            switch (opcao) {
                case 1:
                    criar(scanner, nomes);
                    break;
                case 2:
                    buscarNomes(scanner, nomes);
                    break;
                case 3:
                    atualizar(scanner, nomes);
                    break;
                case 4:
                    deletar(scanner, nomes);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void menu() {
        System.out.println("=== Menu ===");
        System.out.println("1. Criar nomes");
        System.out.println("2. Listar nomes");
        System.out.println("3. Atualizar nomes");
        System.out.println("4. Deletar nomes");
    }

    static void criar(Scanner scanner, ArrayList<String> nomes) {
        System.out.println("Salvando um novo nome...");

        System.out.println("Insira o nome a ser salvo: ");
        String nome = scanner.nextLine();

        nomes.add(nome);

        System.out.println(nome + " foi salvo com sucesso!");
    }

    static void buscarNomes(Scanner scanner, ArrayList<String> nomes) {
        System.out.println("Listando nomes...");

        for (String nome : nomes) {
            System.out.println(nome);
        }
    }


    static void atualizar(Scanner scanner, ArrayList<String> nomes) {
        System.out.println("Atualizando um nome...");

        System.out.println("Insira o nome a ser atualizado: ");
        String nome = scanner.nextLine();

        if (nomes.contains(nome)) {
            // set
            System.out.println("Insira o novo nome: ");
            String novoNome = scanner.nextLine();
            int index = nomes.indexOf(nome);
            nomes.set(index, novoNome);
            System.out.println("O nome " + nome + " foi atualizado para " + novoNome);
        } else {
            System.out.println("O nome " + nome + " nao foi encontrado");
        }
    }

    static void deletar(Scanner scanner, ArrayList<String> nomes) {
        System.out.println("Deletando um nome...");

        // remove
        System.out.println("Insira o nome a ser deletado: ");
        String nome = scanner.nextLine();
        if (nomes.contains(nome)) {
            nomes.remove(nome);
            System.out.println("O nome " + nome + " foi deletado com sucesso!");
        } else {
            System.out.println("O nome " + nome + " nao foi encontrado");
        }
    }
}
