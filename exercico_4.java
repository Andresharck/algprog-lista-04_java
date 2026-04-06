public class exercico_4 {
     
    public static void main(String[] args) {
        // Populações iniciais
        double populacaoA = 80000;
        double populacaoB = 200000;
        
        // Taxas de crescimento (convertidas para decimal)
        double taxaA = 0.03;  // 3%
        double taxaB = 0.015; // 1.5%
        
        int anos = 0;

        // O laço continua enquanto a população de A for menor que a de B
        while (populacaoA < populacaoB) {
            populacaoA += populacaoA * taxaA;
            populacaoB += populacaoB * taxaB;
            anos++;
        }

        // Exibição dos resultados
        System.out.println("Resultados após o cálculo:");
        System.out.println("---------------------------");
        System.out.printf("População final de A: %.0f habitantes%n", populacaoA);
        System.out.printf("População final de B: %.0f habitantes%n", populacaoB);
        System.out.println("Tempo necessário: " + anos + " anos.");
    }
}

