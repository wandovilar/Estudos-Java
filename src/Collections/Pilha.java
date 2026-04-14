package Collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("O Pequeno Príncipe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");



        for (String livro : livros) {
            System.out.println("Loop: " + livro);
        }


        System.out.println(livros.poll()); // Don Quixote
        System.out.println(livros.poll()); // O Pequeno Príncipe
        System.out.println(livros.poll()); // O Hobbit
        System.out.println(livros.poll()); // Lança uma exceção, pois a pilha está vazia.
        //System.out.println(livros.pop());




    }
}
