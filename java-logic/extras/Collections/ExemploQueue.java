package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class ExemploQueue {
    public static void main(String[] args) {
        
        // FIFO - First In, First Out
        Queue<String> nomes = new LinkedList<>();

        nomes.offer("Ana");
        nomes.offer("Bia");
        nomes.offer("Carlos");

        System.out.println("Fila: " + nomes);

        nomes.poll();
        System.out.println("Fila após remover o primeiro elemento: " + nomes);

    }
}
