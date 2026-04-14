package Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();


        // Offer e Add -> Adicionar elementos na fila
        // Diferença é que o Add lança uma exceção se a fila estiver cheia, enquanto o Offer retorna false.





        fila.add("Ana"); // retorna false
        fila.offer("Bia");
        fila.offer("Carlos"); // offer lança uma exeção se a fila estiver cheia.
        fila.offer("Rafaela");
        fila.offer("Gui");

        // Peek e Element -> Consultar o próximo elemento da fila sem removê-lo
        // Diferença é que o Peek retorna null se a fila estiver vazia, enquanto o Element lança uma exceção.




        System.out.println(fila.peek()); // retorna null se a fila estiver vazia.
        System.out.println(fila.peek());
        System.out.println(fila.element()); // lança uma exceção se a fila estiver vazia.
        System.out.println(fila.element());





        // Poll e Remove -> Remover elementos da fila
        // Diferença é que o Poll retorna null se a fila estiver vazia, enquanto
        // o Remove lança uma exceção.

        System.out.println(fila.poll()); // retorna null se a fila estiver vazia.
        System.out.println(fila.poll()); // retorna null se a fila estiver vazia.
        System.out.println(fila.poll()); // retorna null se a fila estiver vazia.
        System.out.println(fila.poll()); // retorna null se a fila estiver vazia.
        System.out.println(fila.poll()); // retorna null se a fila estiver vazia.
        System.out.println(fila.poll()); // retorna null se a fila estiver vazia.

        //fila.size(); // Tamanho da fila
        //fila.clear(); // Limpar a fila
        //fila.isEmpty(); // Verificar se a fila está vazia
        //fila.contains("Ana"); // Verificar se a fila contém um elemento específico

    }
}
