package fundamentos;

public class TipoString {

    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!")); // Contatenar
        System.out.println(s + "!!!"); // Mesma funcionalidade do Concat
        System.out.println(s.startsWith("Boa")); // String Inicia com a String BOA
        System.out.println(s.toLowerCase().startsWith("boa")); // Não inicia com a string boa minuscula
        System.out.println(s.toUpperCase().endsWith("TARDE")); // String termina com TARDE maiusculo
        System.out.println(s.length()); // Contagem quantidade de caracteres
        System.out.println(s.toLowerCase().equals("boa tarde")); // Comparação de igualdade
        System.out.println(s.equalsIgnoreCase("boa tarde")); // Comparação de Igualdade, só que ignora se está Maiuscula ou Minuscula

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome + "\nSobrenome: "
                + sobrenome + "\nIdade: " + idade +
                "\nSalario: " + salario + "\n\n";
        System.out.println(maisUmaFrase); // Fazer contatenação com + ( fica muito chato e tamanho do código muito grande )

        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario); // Usando string de formatação , mais adequado e organizado %s - String, %d - inteiros, %f - Float/Double

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        System.out.println(frase);

        System.out.println("Frase qualquer".contains("qual")); // Confirmando se dentro da String tem "Frase qualquer" tem a "qual" resultado true
        System.out.println("Frase qualquer".indexOf("qual")); // Verifica qual indice onde está a palavrinha qual
        System.out.println("Frase qualquer".substring(6));
        System.out.println("Frase qualquer".substring(6, 10));
    }
}