import java.util.Scanner;

public class ParImpar {
    /* ler um INTEIRO e dizer se ele é par ou ímpar */
    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = input.nextInt();

        if(numero%2 == 0) {
            System.out.println("Par");
        }
        else {
            System.out.println("Impar");
        }

        input.close();
    }

}
