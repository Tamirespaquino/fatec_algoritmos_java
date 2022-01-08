import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        int m;
        Scanner scanner = new Scanner(System.in);
        do {
            boolean ePrimo = true;
            System.out.print("digite um inteiro para saber se e primo ou nao: ");
            m = scanner.nextInt();
            int n = 2;
            int raiz = (int) Math.sqrt(m); // casting
            for (; n <= raiz && ePrimo; n++) {
                if (m % n == 0) {
                    ePrimo = false;
                }
            }
            if (ePrimo) {
                System.out.println(m + " e primo");
            } else {
                System.out.println(m + " nao e primo");
            }
        } while (m != -1);
        scanner.close();
    }
}