public class Escolha {
    public static void main(String[] args) {
        String cidade = "São Paulo";

        switch (cidade) {
            case "São Paulo":
                System.out.println("A maior cidade do Brasil.");
                break;
            case "Rio de Janeiro":
                System.out.println("Cidade de belas praias.");
                break;
            case "Belo Horizonte":
                System.out.println("Cidade de belas montanhas.");
                break;
            default:
                System.out.println("Cidade desconhecida");
                break;
        }

        // switch expressions
        // String mensagem = switch (cidade) {
        //     case "São Paulo" -> "A maior cidade do Brasil.";
        //     case "Rio de Janeiro" -> "Cidade de belas praias.";
        //     case "Belo Horizonte" -> "Cidade de belas montanhas.";
        //     default -> "Cidade desconhecida";
        // };
    }
}
