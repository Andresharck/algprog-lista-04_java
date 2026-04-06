public class exercicio_6 {
    
    public static void main(String[] args) {
        
        System.out.println("--- Números de 1 a 20 (um abaixo do outro) ---");
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        System.out.println("\n--- Números de 1 a 20 (um ao lado do outro) ---");
        for (int i = 1; i <= 20; i++) {
            System.out.print(i + " ");
        }
        
        // Apenas para pular uma linha ao final do programa
        System.out.println();
    }
}

