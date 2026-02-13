package fundamentos.operadores;

public class DesafioLogicos {
    public static void main(String[] args) {

        // Trabalho1 na terça ( V ou F )
        // Trabalho2 na quinta ( V ou F )

        boolean trabalho1 = false;
        boolean trabalho2 = false;

        boolean comprouTv50 = trabalho1 && trabalho2;
        boolean comprouTv32 = trabalho1 ^ trabalho2;
        boolean comprouSorvete = trabalho1 || trabalho2;
        boolean maisSaudavel = !comprouSorvete;




        System.out.println("Comprou TV 50\"?" + comprouTv50); // false
        System.out.println("Comprou TV 32\"?" + comprouTv32); // false
        System.out.println("Comprou Sorvete\"?" + comprouSorvete); // false
        System.out.println("Mais saudável\"?" + maisSaudavel); // false











    }
}
