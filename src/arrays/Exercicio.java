package arrays;

import java.util.Arrays;

public class Exercicio {
    public static void main(String[] args) {
        // Criando um array de notas para o aluno A
        double[] notasAlunoA = new double[4];
        // Atribuindo valores às notas do aluno A utilizando o índice do array
        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        // Imprimindo o array de notas do aluno A utilizando o metodo toString da classe Arrays
        String resultado = Arrays.toString(notasAlunoA);
        System.out.println(resultado);

        // Percorrendo o array com for  e calculando a média do aluno A
        double totalAlunoA = 0;
        for (int i = 0; i < notasAlunoA.length; i++) {
            totalAlunoA += notasAlunoA[i];
        }

        System.out.println(totalAlunoA / notasAlunoA.length);

        // Criando um array de notas para o aluno B e atribuindo os valores diretamente
        // Utilizando uma variável para armazenar uma nota e depois atribuindo essa variável ao array
        // ( funciona da mesma forma que atribuir o valor diretamente ao array,
        // mas pode ser útil para reutilizar a nota em outros lugares do código ou para facilitar a leitura do código)

        final double notaArmazenada = 5.9;
        double[] notasAlunoB = {6.9, 8.9, notaArmazenada, 10};


        // Percorrendo o array com for e calculando a média do aluno B
        double totalAlunoB = 0;
        for (int i = 0; i < notasAlunoB.length; i++) {
            totalAlunoB += notasAlunoB[i];

        }

        System.out.println(totalAlunoB / notasAlunoB.length);
    }
}
