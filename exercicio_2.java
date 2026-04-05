import java.util.Objects;
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class exercicio_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Digite o nome do usurario: ");
            String senha = sc.next();

            System.out.println("Digite a senha: ");
            String usuario = sc.next();

            if (!Objects.equals(usuario, senha)) {
                System.out.println("Acesso permitido: ");
                break;
            } else {
                System.out.println("Senha inavalida ");
                System.out.println("Digite novamente");

            }

        }
        sc.close();
    }
}