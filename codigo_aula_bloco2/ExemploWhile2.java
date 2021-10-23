package codigo_aula_bloco2;
import java.util.Scanner;

public class ExemploWhile2 {
    public static void main (String args[]) {
        boolean eParaFazer = true;
        Scanner input = new Scanner(System.in);

        while (eParaFazer == true) {
            System.out.println("estou fazendo");
            System.out.print("para ou continua?");
            String opcaoString = input.nextLine();
            char opcaoChar = opcaoString.charAt(0);
            if (opcaoChar == 'P' || opcaoChar == 'p') {
                eParaFazer = false;
            }
        }
        input.close();
    }
}

// Variáveis booleanas não precisam ser declaradas, ou seja, 
// não precisava escrever eParaFazer = true, mas sim podia ser
// só eParafazer porque ele já considera true porque é declarado como um boolean
