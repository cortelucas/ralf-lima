package Collections;

import java.util.Stack;

public class ExemploStack {
    public static void main(String[] args) {
        
        // LIFO - Last In, First Out
        Stack<String> paginas = new Stack<>();

        paginas.push("www.cortelucas.com");
        paginas.push("www.github.com/cortelucas");
        paginas.push("www.youtube.com/olucascorte");

        System.out.println("Pilha: " + paginas);

        // Quando trabalhamos com pilhas não conseguimos remover um elemento específico, apenas o último elemento adicionado pode ser removido.
        paginas.pop();
        System.out.println("Pilha após remover o último elemento: " + paginas);

        // Peek - Pega o topo da pilha
        System.out.println("Pilha: " + paginas);
        System.out.println("Pilha: " + paginas.peek());
    }
}
