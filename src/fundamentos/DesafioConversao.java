package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seus Últimos 3 salarios");

        String s1 = entrada.next().replace(",", ".");
        String s2 = entrada.next().replace(",", ".");
        String s3 = entrada.next().replace(",", ".");



        double sal1 = Double.parseDouble(s1);
        double sal2 = Double.parseDouble(s2);
        double sal3 = Double.parseDouble(s3);


        double media = (sal1 + sal2 + sal3) / 3;


        System.out.printf("Média Salarial é de R$ %f", media);

        entrada.close();
    }
}



