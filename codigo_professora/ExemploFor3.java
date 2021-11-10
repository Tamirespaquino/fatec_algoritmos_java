import java.util.Scanner;
public class ExemploFor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continua;
        for (continua=true; continua==true; ) {
            System.out.print("digite \"continue\" para continuar, ou outra coisa para parar ");
            String opcao = scanner.nextLine().toUpperCase();
            if (!opcao.equals("CONTINUE")) {
                continua = false;
            }
        }
        scanner.close();
    }
}
