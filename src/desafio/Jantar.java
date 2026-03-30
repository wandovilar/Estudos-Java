package desafio;

public class Jantar {
    public static void main(String[] args) {


        Comida c1 = new Comida("Feijão", 0.250);


        Comida c2 = new Comida("Arroz", 0.350);


        Pessoa p1 = new Pessoa("Maria", 70.50);





        System.out.println(p1.aprensentar());
        p1.comer(c1);
        System.out.println("Ela comeu " + c1.nome + ".");


        System.out.println(p1.aprensentar());
        p1.comer(c2);
        System.out.println("Ela comeu " + c2.nome + ".");

        System.out.println(p1.aprensentar());



    }
}
