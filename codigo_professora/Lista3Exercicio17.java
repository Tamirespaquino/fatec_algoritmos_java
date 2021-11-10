//Faça um programa que lê um número inteiro positivo n e calcula a soma dos n primeiros números naturais.
import java.util.Scanner;
public class Lista3Exercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        System.out.print("Informe um numero inteiro positivo: ");
        int n = scanner.nextInt();
        while(n <= 0) {
            System.out.print("Numero informado invalido.\nInforme um numero inteiro positivo: ");
            n = scanner.nextInt();
        }
        for(int i = 1; i <= n; i++) {
            soma += i; //soma = soma + i;
        }
        System.out.println("A soma dos " + n + " primeiros numeros naturais e: " + soma);
        scanner.close();
    }
}
