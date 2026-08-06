package Collections;

import java.util.LinkedList;

public class ExemploLinkedList {
    public static void main(String[] args) {
        
        LinkedList<String> cores = new LinkedList<>();

        cores.add("Azul");
        cores.add("Vermelho");
        cores.add("Verde");
        cores.add("Amarelo");

        cores.set(1, "Branco");

        for (String cor : cores) {
            System.out.println("Cor: " + cor);
        }

        System.out.println("\nRemovendo a cor na posição 2: " + cores.get(2));
        cores.remove(2);

        for (String cor : cores) {
            System.out.println("Cor: " + cor);
        }

        System.out.println("\nRemovendo a primeira cor: " + cores.getFirst());
        cores.removeFirst();

        for (String cor : cores) {
            System.out.println("Cor: " + cor);
        }

        System.out.println("\nRemovendo a última cor: " + cores.getLast());
        cores.removeLast();

        for (String cor : cores) {
            System.out.println("Cor: " + cor);
        }

        System.out.println("\nRemovendo todas as cores: ");
        cores.clear();

        for (String cor : cores) {
            System.out.println("Cor: " + cor);
        }
    }
}
