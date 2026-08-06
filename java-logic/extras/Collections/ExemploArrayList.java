package Collections;
import java.util.ArrayList;

public class ExemploArrayList {
    public static void main(String[] args) {
        
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Lucas");
        nomes.add("Andressa");
        nomes.add("Sonia");
        nomes.add("Antonio");
        nomes.add("Leonardo");

        nomes.set(1, "Neko-chan");

        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }
    }
}
