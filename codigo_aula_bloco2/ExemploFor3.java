package codigo_aula_bloco2;
import java.util.Scanner;

public class ExemploFor3 {
    
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        boolean continua;

        for (continua = true; continua == true; ) {
            System.out.print("Digite \"continue\" para continuar, ou outra coisa para parar ");
            String opcao = scanner.nextLine().toUpperCase();
            if (!opcao.equals("CONTINUE")) {
                continua = false;
            }
        }

        scanner.close();        
    }
}
