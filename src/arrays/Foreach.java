package arrays;

public class Foreach {
    public static void main(String[] args) {

        double[] notas = {9.9, 8.7, 7.2, 9.5};

        // Percorrendo o array utilizando o for tradicional e imprimindo as notas do aluno
        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i] + "");
        }

        System.out.println("Utilizando o foreach: ");

        // Percorrendo o array utilizando o foreach e calculando a média do aluno

        for (double nota: notas){
            System.out.println(nota + " ");
        }
    }
}
