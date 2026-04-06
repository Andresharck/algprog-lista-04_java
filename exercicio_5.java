import java.util.Scanner;

public class exercicio_5 {

    


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        char continuar;

        do {
            System.out.println("\n--- Simulador de Crescimento Populacional ---");

            // Entrada e validação da População A
            double popA = lerValorPositivo(teclado, "População inicial do país A: ");
            double taxaA = lerValorPositivo(teclado, "Taxa de crescimento de A (ex: 3 para 3%): ") / 100;

            // Entrada e validação da População B
            double popB = lerValorPositivo(teclado, "População inicial do país B: ");
            double taxaB = lerValorPositivo(teclado, "Taxa de crescimento de B (ex: 1.5 para 1.5%): ") / 100;

            int anos = 0;

            // Lógica de cálculo
            if (taxaA <= taxaB && popA < popB) {
                System.out.println("\n[Erro] Com essa taxa, a população A nunca alcançará a B.");
            } else {
                while (popA < popB) {
                    popA += popA * taxaA;
                    popB += popB * taxaB;
                    anos++;
                }
                System.out.printf("%nResultado: A ultrapassará B em %d anos.%n", anos);
                System.out.printf("População A: %.0f | População B: %.0f%n", popA, popB);
            }

            System.out.print("\nDeseja realizar nova simulação? (s/n): ");
            continuar = teclado.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa encerrado.");
        teclado.close();
    }

   

    private static double lerValorPositivo(Scanner sc, String mensagem) {
        double valor;
        do {
            System.out.print(mensagem);
            while (!sc.hasNextDouble()) {
                System.out.println("Por favor, digite um número válido.");
                sc.next();
            }
            valor = sc.nextDouble();
            if (valor <= 0) {
                System.out.println("O valor deve ser maior que zero.");
            }
        } while (valor <= 0);
        return valor;
    }
}
