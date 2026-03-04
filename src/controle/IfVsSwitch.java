package controle;

public class IfVsSwitch {
    public static void main(String[] args) {

        System.out.println("========== IF/ELSE vs SWITCH ==========\n");

        // ===== EXEMPLO 1: IF/ELSE (para lógicas/intervalos) =====
        System.out.println("--- EXEMPLO 1: IF/ELSE (Comparações) ---");
        int nota = 8;

        if (nota >= 9) {
            System.out.println("Excelente!");
        } else if (nota >= 7) {
            System.out.println("Bom!");
        } else if (nota >= 5) {
            System.out.println("Satisfatório");
        } else {
            System.out.println("Reprovado");
        }

        // ===== EXEMPLO 2: SWITCH (para valores específicos) =====
        System.out.println("\n--- EXEMPLO 2: SWITCH (Valores exatos) ---");
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            default:
                System.out.println("Fim de semana");
        }

        // ===== EXEMPLO 3: Se usasse IF/ELSE para dia (ruim!) =====
        System.out.println("\n--- EXEMPLO 3: IF/ELSE para dia (NÃO recomendado) ---");
        if (dia == 1) {
            System.out.println("Segunda-feira");
        } else if (dia == 2) {
            System.out.println("Terça-feira");
        } else if (dia == 3) {
            System.out.println("Quarta-feira");
        } else if (dia == 4) {
            System.out.println("Quinta-feira");
        } else if (dia == 5) {
            System.out.println("Sexta-feira");
        } else {
            System.out.println("Fim de semana");
        }
        // ❌ Muito código repetido!

        // ===== EXEMPLO 4: Se usasse SWITCH para nota (ruim!) =====
        System.out.println("\n--- EXEMPLO 4: SWITCH para nota (NÃO recomendado) ---");
        // Não funciona bem! Switch não aceita intervalos
        // switch (nota) {
        //     case 9:
        //     case 10:
        //         System.out.println("Excelente!");
        // }
        System.out.println("❌ Switch não funciona bem com intervalos!");

    }
}
