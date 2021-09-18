import java.util.Scanner;

public class Exercicio4A {
    public static void main (String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("digite um numero inteiro: ");
        int n = entrada.nextInt();

        int suc = n+1;
        int ant = n-1;

        System.out.println("sucessor de " + n + " = " + suc);
        System.out.println("antecessor de " + n + " = " + ant);

        entrada.close();
    }
}
