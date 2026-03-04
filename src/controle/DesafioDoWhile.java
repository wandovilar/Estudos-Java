package controle;

import java.util.Scanner;

public class DesafioDoWhile {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        double sum = 0.0;
        int cont = 0;
        double nota;

        System.out.println("Digite a nota ou -1 para sair.");

        do {
            System.out.println("Digite sua nota: ");
            nota = entrada.nextDouble();

            if (nota != -1) {
                sum += nota;
                cont++;
            } else {
                break;
            }
        } while (nota != -1);

        if (nota > 0) {
            double media = sum / cont;
            System.out.printf("Nota total: %.2f ", sum);
            System.out.printf("Quantidade de notas %d ", cont);
            System.out.printf("Sua média final é %.2f ", media);
        }
        System.out.println("Programa Encerrado");

        entrada.close();
    }
}
