import java.util.Scanner;

public class exercico_7 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        // Inicializamos o maior com o menor valor possível para um Double
        // ou poderíamos ler o primeiro número fora do loop.
        double maior = Double.NEGATIVE_INFINITY;

        System.out.println("Digite 5 números:");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Número " + i + ": ");
            double numero = teclado.nextDouble();

            // Se o número atual for maior que o registrado, ele se torna o novo maior
            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("\nO maior número digitado foi: " + maior);
        
        teclado.close();
    }
}

