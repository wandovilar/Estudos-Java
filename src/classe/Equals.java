package classe;

import java.util.Date;

public class Equals {
    public static void main(String[] args) {

        Usuario u1 = new Usuario();
        u1.nome = "Pedro Siva";
        u1.email = "pedro.silva@ezemail.com.br";


        Usuario u2 = new Usuario();
        u2.nome = "Pedro Siva";
        u2.email = "pedro.silva@ezemail.com.br";

        System.out.println(u1 == u2); // false, pois são objetos diferentes na memória
        System.out.println(u1.equals(u2));// false , como não mexeu no equals, ele compara a referência de memória, e como são objetos diferentes, retorna false
        System.out.println(u2.equals(u1)); // false, mesma explicação do equals acima


       // System.out.println(u2.equals(new Date()));



    }
}
