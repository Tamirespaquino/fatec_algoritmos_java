package codigo_aula_bloco2;
import java.util.Scanner;

public class ExemploWhile3 {
    public static void main (String args[]) {
        char opcaoChar = 'c';
        Scanner input = new Scanner(System.in);

        while (opcaoChar == 'c' || opcaoChar == 'C') {
            System.out.println("estou fazendo");
            System.out.print("para ou continua?");
            opcaoChar = input.nextLine().charAt(0);
        }
        input.close();
    }
}

// Observação: só vai parar quando o usuário digitar 'p' ou 'P'
