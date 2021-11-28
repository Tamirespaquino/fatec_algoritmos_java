//Faça um programa que lê um número inteiro positivo ímpar N e imprime todos os números ímpares de 1 até N em ordem crescente.

import java.util.Scanner;
public class Lista3Exercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("digite um numero impar positivo: ");
        int n = scanner.nextInt();
        while (n <= 0 || n%2==0) {
            System.out.print("o numero deve ser positivo e impar: ");
            n = scanner.nextInt();
        }
        System.out.println("\nimpares de 1 a " + n + " em ordem crescente:");
        for (int i = 1; i <= n; i=i+2) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
