package controle;

import java.util.Scanner;

public class DesafioDiaDaSemana {
    public static void main(String[] args) {


        Scanner entrada = new Scanner(System.in);


        System.out.println("Escreva o dia da semana: ");
        String dia = entrada.next();

        if (dia.equalsIgnoreCase("Domingo")) {
            System.out.printf("%s é o dia 1", dia);
        } else if (dia.equalsIgnoreCase("Segunda")) {
            System.out.printf("%s é o dia 2", dia);
        } else if (dia.equalsIgnoreCase("Terça")
                || dia.equalsIgnoreCase("Terca")) {
            System.out.printf("%s é o dia 3", dia);
        } else if (dia.equalsIgnoreCase("Quarta")) {
            System.out.printf("%s é o dia 4", dia);
        } else if (dia.equalsIgnoreCase("Quinta")) {
            System.out.printf("%s é o dia 5", dia);
        } else if (dia.equalsIgnoreCase("Sexta")) {
            System.out.printf("%s é o dia 6", dia);
        } else if (dia.equals("Sábado")
                || dia.equals("Sabado")) {
            System.out.printf("%s é o dia 7", dia);
        } else {
            System.out.println("Este dia não existe, tente novamente !");
        }

    entrada.close();


    }
}
