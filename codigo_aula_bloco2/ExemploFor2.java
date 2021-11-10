package codigo_aula_bloco2;
import java.util.Scanner;

public class ExemploFor2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean eParaFazer;
        
        for (eParaFazer=true; eParaFazer; ) { // neste caso, é melhor colocar o contador dentro do for
            System.out.println("Estou fazendo, para ou continua?");
            char opcao = scanner.nextLine().toLowerCase().charAt(0);
            // String opcao = scanner.nextLine().toLowerCase();
            
            if(opcao == 'p') {
            // if (opcao.equals("pare"))
                eParaFazer = false;
            }
        }
        scanner.close();        
    }
}

