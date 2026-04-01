package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DesafioArray {
    public static void main(String[] args) {
        // Desafio: Criar um programa que receba a quantidade de notas de um aluno,
        // armazene as notas em um array e calcule a média do aluno.

        //Solicitando ao usuário a quantidade de notas do aluno e armazenando essa quantidade em uma variável
        System.out.println("Digite a quantidade de notas do aluno: ");
        Scanner entrada = new Scanner(System.in);
        int quantidadeNotas = entrada.nextInt();

        // Criando um array de notas para o aluno com o tamanho definido pela quantidade de notas digitada pelo usuário
        double[] notas = new double[quantidadeNotas];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite a nota " + (i + 1) + ": ");
            double nota = entrada.nextDouble();
            notas[i] = nota;
        }

        // Imprimindo o array de notas do aluno utilizando o metodo toString da classe Arrays
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        //Calculando a média do aluno
        double media = soma / notas.length;

        // Imprimindo as notas do aluno utilizando o metodo toString da classe Arrays
        String listNotas = Arrays.toString(notas);
        System.out.println("As notas do aluno são: " + listNotas);

        // Imprimindo a média do aluno
        System.out.println("A média do aluno é: " + media);
    }
}
