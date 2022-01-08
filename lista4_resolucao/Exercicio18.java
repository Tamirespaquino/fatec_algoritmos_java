package lista4_resolucao;
import java.util.Scanner;

public class Exercicio18 {
//     Faca um programa que leia um vetor de 10 numeros. Leia um numero x. Conte os
// multiplos de um numero inteiro x num vetor e mostre-os na tela.

    public static void main(String[] args) {
        int[] vetor = new int[10];
        int contador = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i+1) + "o valor ");
            vetor[i] = scanner.nextInt();
        }

        System.out.println("Digite um numero inteiro: ");
        int x = scanner.nextInt();
        System.out.println("Os numeros multiplos de " + x + " que se encontram no vetor sao: "); 
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i]%x == 0) {
                contador++;  
                System.out.println(contador + " " + vetor[i] + " ");       
            }
        }       
        
        scanner.close(); 
    }
}
