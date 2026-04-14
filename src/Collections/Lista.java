package Collections;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {

      List<Usuario> lista = new ArrayList<>();

        Usuario u1 = new Usuario("Ana");
        lista.add(u1);

        lista.add(new Usuario("Carlos"));
        lista.add(new Usuario("Lia"));
        lista.add(new Usuario("Bia"));
        lista.add(new Usuario("Manu"));

        System.out.println(lista.get(3).nome);

        System.out.println(">>>>> " + lista.remove(1));; // Remove pelo indice
        System.out.println(lista.remove(new Usuario("Manu")));; // Remove pelo objeto

        System.out.println("Tem ?" + lista.contains(new Usuario("Lia"))); // Verificar se existe um objeto na lista


        for (Usuario u : lista) { // Acessar pelo indice
            System.out.println(u.nome);
        }



    }

}
