/*
    Desenvolva um sistema CRUD para gerenciar produtos. As funcionalidades solicitadas são:
    - Cadastro: Peça o nome de um produto, segmento, marca e valor.
    - Listagem: Exiba todos os produtos e suas características.
    - Filtragem: Crie um filtro para exibir os produtos por marca ou segmento.
    - Alterar: Implementa a alteração de dados dos produtos cadastrados.
    - Remover: Remova os produtos.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.UUID;

public class Products {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int opcao;

        Map<String, String> products = new HashMap<>();

        System.out.println("=== Sistema de Gerenciamento de Produtos ===");
        System.out.println("Insira seu nome: ");
        String nomeUsuario = scanner.nextLine();
        System.out.println("Bem-vindo(a), " + nomeUsuario + "!");

        menu();

        do {
            System.out.print("Escolha uma opção (1-5) ou 0 para sair: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("\n=== Cadastro de Produto ===");
                    cadastrarProduto(scanner, products);
                    break;
                case 2:
                    System.out.println("\n=== Listagem de Produtos ===");
                    listarProdutos(products);
                    break;
                case 3:
                    System.out.println("\n=== Buscar produto por ID ===");
                    String productId = lerId(scanner);
                    buscarProdutoPorId(productId, products);
                    break;
                case 4:
                    System.out.println("\n=== Alteração de Produto ===");
                    String putProductId = lerId(scanner);
                    alterarProduto(scanner, putProductId, products);
                    break;
                case 5:
                    System.out.println("\n=== Remoção de Produto ===");
                    String removeProductId = lerId(scanner);
                    removerProduto(removeProductId, products);
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
        System.out.println("1. Cadastrar produto");
        System.out.println("2. Listar produtos");
        System.out.println("3. Buscar produto por ID");
        System.out.println("4. Alterar produto");
        System.out.println("5. Remover produto");
    }

    private static String lerId(Scanner scanner) {
        System.out.print("Insira o ID do produto: ");
        return scanner.nextLine();
    }

    private static void cadastrarProduto(Scanner scanner, Map<String, String> products) {
        String id = UUID.randomUUID().toString().substring(0, 8);

        System.out.println("Insira o nome do produto: ");
        String name = scanner.nextLine();

        if (name == null || name.trim().isEmpty()) {
            System.out.println("O nome do produto não pode ser vazio.");
            System.out.println("Cadastro de produto finalizado.");
            return;
        }
        if (name.length() < 3) {
            System.out.println("O nome do produto precisa ter pelo menos 3 caracteres.");
            System.out.println("Cadastro de produto finalizado.");
            return;
        }

        products.put(id, name);
        System.out.println("Produto cadastrado com sucesso! ID: " + id);
        System.out.println("Cadastro de produto finalizado.");
    }

    private static void listarProdutos(Map<String, String> products) {
        if (products.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            for (Map.Entry<String, String> entry : products.entrySet()) {
                System.out.println("ID: " + entry.getKey() + ", Nome: " + entry.getValue());
            }
        }
        System.out.println("Listagem de produtos finalizada.");
    }

    private static void buscarProdutoPorId(String id, Map<String, String> products) {
        if (products.containsKey(id)) {
            String name = products.get(id);
            System.out.println("Produto encontrado: ID: " + id + ", Nome: " + name);
        } else {
            System.out.println("Produto não encontrado.");
        }
        System.out.println("Busca de produto finalizada.");
    }

    private static void alterarProduto(Scanner scanner, String id, Map<String, String> products) {
        if (products.containsKey(id)) {
            System.out.println("Insira o novo nome do produto: ");
            String newName = scanner.nextLine();

            if (newName == null || newName.trim().isEmpty()) {
                System.out.println("O novo nome do produto não pode ser vazio.");
            } else {
                products.put(id, newName);
                System.out.println("Produto alterado com sucesso!");
            }
        } else {
            System.out.println("Produto não encontrado.");
        }
        System.out.println("Alteração de produto finalizada.");
    }

    private static void removerProduto(String id, Map<String, String> products) {
        try {
            if (products.containsKey(id)) {
                products.remove(id);
                System.out.println("Produto removido com sucesso!");
            } else {
                System.out.println("Produto nao encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao remover produto: " + e.getMessage());
        } finally {
            System.out.println("Remoção de produto finalizada.");
        }
    }
}
