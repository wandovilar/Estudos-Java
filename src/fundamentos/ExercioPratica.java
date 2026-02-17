package fundamentos;

import java.util.Scanner;

public class ExercioPratica {

    public static void main(String[] args) {

        // Fundamentos

        //1 Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.

       /* Scanner entrada = new Scanner(System.in);
        System.out.println("Digite temperatura em Fahrenheit para converter em Celsius: ");
        double fahrenheit = entrada.nextDouble();
        double formulaFahrenheit = (fahrenheit - 32) * 5 / 9;

        System.out.printf("Temperatura de %f F° convertido para Celsius é %f °C", fahrenheit, formulaFahrenheit);

        entrada.close();
*/

        //2 Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.

      /*  Scanner entrada = new Scanner(System.in);

        System.out.println("Digite temperatura em Celsius par converter para fahrenheit: ");

        int celsius = entrada.nextInt();

        int formulaCelsius = (celsius * 9 / 5) + 32;

        System.out.printf("Temperatura de %d C° convertido para Fahreinheit é %d °F", celsius, formulaCelsius);

        entrada.close();*/


        //3 Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.

        /*Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o  seu peso: ");
        double peso = entrada.nextDouble();

        System.out.println("Digite a sua Altura: ");
        double altura = entrada.nextDouble();

        double formulaIMC = peso / (altura * altura);
        double result = formulaIMC;

        System.out.printf("Seu IMC é de %.2f", result);

        entrada.close();
*/

        //4 Criar um programa que leia um valor e apresente os resultados ao quadrado e ao cubo do valor.

        /*Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número: ");
        double num = entrada.nextDouble();

        double quadrado = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);

        System.out.printf("Você escolheu %.2f, que ao Quadrado é %.2f e ao Cubo é %.2f", num, quadrado, cubo);
*/
        //5 Criar um programa que leia o valor da base e da altura de um triângulo e calcule a área.

        /*Scanner entrada = new Scanner(System.in);

        System.out.println("Digite valor da BASE: ");
        double base = entrada.nextDouble();

        System.out.println("Digite valor da ALTURA: ");
        double alturaTriangulo = entrada.nextDouble();

        double delta = (base * alturaTriangulo) / 2;

        System.out.printf("O valor da área é de %.2f cm².", delta);

        entrada.close();*/

        /*6 Criar um programa que resolve equações do segundo grau (ax2 + bx + c = 0) utilizando a fórmula de
        Bhaskara.Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
        */


     /*   //Coeficientes
        int a = 1;
        int b = 1;
        int c = -6;

        //Delta

        double formula = Math.pow(b, 2) - 4 * a * (c);
        System.out.printf("Valor de delta é %.2f.\n", formula);

        // Achando as raízes

        double raizesX1 = ((-(b) + Math.sqrt(formula)) / (2 * a));
        double raizesX2 = ((-(b) - Math.sqrt(formula)) / (2 * a));

        System.out.println(raizesX1);
        System.out.println(raizesX2);
*/
    }

}
