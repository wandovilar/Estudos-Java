package fundamentos;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {

        // 1
//
//        Scanner entrada = new Scanner(System.in);
//
//        System.out.println("Digite seu nome: ");
//        String nome = entrada.nextLine();
//
//        System.out.println("Digite a sua idade: ");
//        int idade = entrada.nextInt();
//
//        System.out.println("Digite o seu Salário: R$ ");
//        double salario = entrada.nextDouble();
//
//        System.out.printf("Seu nome é %s, sua idade é %d e o seu Salário é R$ %.2f", nome, idade, salario);
//
//        entrada.close();


        //2
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("Digite um número: ");
//        int numero = entrada.nextInt();
//
//        if (numero % 2 == 0) {
//            System.out.printf("Você digitou número %d, ele é par", numero);
//
//        }else {
//            System.out.printf("Você digitou %d, ele é Ímpar", numero);
//        }
//        entrada.close();

        //3

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escolha número: ");
        int number1 = entrada.nextInt();

        System.out.println("Escolha número: ");
        int number2 = entrada.nextInt();

        System.out.println("Escolha número: ");
        int number3 = entrada.nextInt();

        if (number1 > number2 && number1 > number3) {
            System.out.printf("O número %d é maior que %d e %d%n", number1, number2, number3);
        } else if (number2 > number1 && number2 > number3) {
            System.out.printf("O número %d é maior que %d e %d%n", number2, number1, number3);
        } else if (number3 > number1 && number3 > number2) {
            System.out.printf("O número %d é maior que %d e %d%n", number3, number1, number2);
        } else {
            System.out.println("Todos os números são iguais! :D");
        }


        entrada.close();


    }
}
