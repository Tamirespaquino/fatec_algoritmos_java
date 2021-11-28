package lista3_resolucao;

import java.util.Scanner;

public class Exercicio5 {
    // Faca um programa que peca ao usuario para digitar 10 valores e some-os. 

    public static void main(String[] args) {
        double digiteValores, soma;
        soma = 0;
        int contador = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 numeros ");
        while(contador <= 10) {     
            digiteValores = scanner.nextDouble();       
            soma += digiteValores;
            contador++;            
        }
        System.out.println("A soma dos 10 valores digitados eh " + soma);
        scanner.close();           
    }
    
}
