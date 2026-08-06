package Collections;

import java.util.HashMap;

public class ExemploHashMap {
    public static void main(String[] args) {
        
        HashMap<String, String> linguagens = new HashMap<>();

        linguagens.put("Java", "Linguagem multiplataforma");
        linguagens.put("Python", "Linguagem de alto nível");
        linguagens.put("JavaScript", "Linguagem de programação interpretada");

        System.out.println("Linguagens: " + linguagens);

        System.out.println("Linguagem: " + linguagens.get("Java"));

        // Removendo um elemento do HashMap
        linguagens.remove("Python");
        System.out.println("Linguagens: " + linguagens);
    }
}
