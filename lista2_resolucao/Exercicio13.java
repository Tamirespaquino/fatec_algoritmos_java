package lista2_resolucao;
import java.util.Scanner;

public class Exercicio13 {

    public static void main (String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite valor de a: ");
        int a = entrada.nextInt();
        System.out.print("Digite valor de b: ");
        int b = entrada.nextInt();
        System.out.print("Digite valor de c: ");
        int c = entrada.nextInt();

        int x = 2 * ( (a - c) / 8) - b * 5;

        System.out.println("O valor final sera: " + x);

        entrada.close(); 

    }
    
}
