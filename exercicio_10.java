import java.util.Scanner;

public class exercicio_10 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        int inicio, fim;

        if (num1 < num2) {
            inicio = num1;
            fim = num2;
        } else {
            inicio = num2;
            fim = num1;
        }

        System.out.println("Números no intervalo:");

        for (int i = inicio + 1; i < fim; i++) {
            System.out.println(i);
        }

        sc.close();
    }
}

    

