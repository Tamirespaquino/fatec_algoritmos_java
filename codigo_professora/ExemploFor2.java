import java.util.Scanner;
public class ExemploFor2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean eParaFazer;
        for (eParaFazer=true; eParaFazer; ) {
            System.out.println("Estou fazendo, para ou continua?");
            String opcao = scanner.nextLine().toLowerCase();
            if (opcao.equals("pare"))  {
                eParaFazer = false;
            }
        }
        scanner.close();
    }
}
