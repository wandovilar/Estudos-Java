package controle;

public class LoopAninhado {
    public static void main(String[] args) {
        
        // EXEMPLO 1: Multiplicação de 1 a 3 por 1 a 3
        System.out.println("=== EXEMPLO 1: Tabuada Simples ===");
        for (int i = 1; i <= 3; i++) {  // LOOP EXTERNO
            System.out.println("\nLinha " + i);
            for (int j = 1; j <= 3; j++) {  // LOOP INTERNO (dentro do externo)
                System.out.println("  " + i + " x " + j + " = " + (i * j));
            }
        }
        
        // EXEMPLO 2: Padrão de asteriscos
        System.out.println("\n=== EXEMPLO 2: Padrão ===");
        for (int i = 1; i <= 3; i++) {  // LOOP EXTERNO (linhas)
            for (int j = 1; j <= i; j++) {  // LOOP INTERNO (colunas)
                System.out.print("*");
            }
            System.out.println();  // Quebra de linha
        }
        
    }
}
