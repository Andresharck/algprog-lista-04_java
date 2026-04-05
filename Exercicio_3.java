import java.util.Scanner;

public class Exercicio_3 {
    public static void main(String[] args) {
        // classse Escanner
        Scanner sc = new Scanner(System.in);
        // Variaveis declaradas

        while (true) {
            System.out.println("informe o seu nome: ");
            String nome = sc.next();
            if (nome.length() < 3) {
                System.out.println("Nome digitado menor que tres  caracteres!! ");
                System.out.println("Digite novamente");
                continue;

            }
            System.out.println("informe a sua idade: ");
            int idade = sc.nextInt();
            if (idade < 0 || idade > 150) {
                System.out.println("idade inavlida");
                System.out.println("Digite a sua idade novamente");
                continue;
            }

            System.out.println("Informe o seu salario: ");
            double salario = sc.nextDouble();
            if (salario <= 0) {
                System.out.println("Salario invalido!! ");
                System.out.println("Digite novamente:  ");
                continue;
            }
            System.out.println("infor seu sexo");
            char sexo = sc.next().charAt(0);
            if (sexo != 'f' && sexo != 'm') {
                System.out.println("sexo invalido!!");
                System.out.println("digite seu sexo novamente");
                continue;
            }
            System.out.println("Informe o estado civil");
            char estado_civil = sc.next().charAt(0);
            if (estado_civil != 's' && estado_civil != 'c' && estado_civil != 'v' && estado_civil != 'd') {
                System.out.println("Estado civil ");
                System.out.println("Digite novamente");
                continue;
            }
            System.out.println("-------Relatorio Pessoal-----");
            System.out.println("Nome " + nome);
            System.out.println("Idade "+ idade);
            System.out.println("Sexo "+ sexo);
            System.out.println("Estado civil "+ estado_civil);
            break;
    

        }
        sc.close();
    }
}
