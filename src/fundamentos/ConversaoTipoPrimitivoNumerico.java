package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        double a = 1; // Implícita
        System.out.println(a);

        float b = (float) 1.1123131234566565; // Explicita (Cast)
        System.out.println(b);

        int c = 4;
        byte d = (byte) c; // Explicita (Cast)
        System.out.println(d);

        double e = 1.99999999;
        int f = (int) e;
        System.out.println(f);

    }
}
