//Faça um programa que lê um número inteiro positivo N e imprime todos os números naturais de 0 até N em ordem crescente.
import java.util.Scanner;

public class Lista3Exercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero inteiro: ");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("o numero deve ser positivo!");
            n = scanner.nextInt();
        }
        System.out.println("\nnumeros em ordem crescente:");
        for (int i = 0; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n\nnumeros em ordem decrescente:");
        for (int i = n; i >= 0; i--) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
