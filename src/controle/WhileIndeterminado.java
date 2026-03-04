package controle;

import java.util.Scanner;

public class WhileIndeterminado {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);


        String frase = "";

        while (!frase.equalsIgnoreCase("sair")) {

            System.out.println("Digite uma Frase: ");
            frase = entrada.nextLine().trim();

        }
        entrada.close();
    }
}
