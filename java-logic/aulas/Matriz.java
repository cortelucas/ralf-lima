public class Matriz {
    public static void main(String[] args) {

        // Matriz é um array de arrays
        String[][] clientes = {
                { "Paulo", "Joinville" },
                { "Maria", "São Paulo" },
                { "João", "Rio de Janeiro" }
        };

        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Cliente: " + clientes[i][0] + ", Cidade: " + clientes[i][1]);
        }
    }
}
