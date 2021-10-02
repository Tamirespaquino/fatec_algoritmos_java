package listaExtra;
import java.util.Scanner;

public class A1Exercicio1 {

    public static void main (String args[]) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite um numero inteiro: ");
        int n = entrada.nextInt();

        int antecessor = n-1;
        int sucessor = n+1;

        System.out.println("O antecessor do numero " + n + " digitado eh: " + antecessor);
        System.out.println("O sucessor do numero " + n + " digitado eh: " + sucessor);

        entrada.close();

    }
}