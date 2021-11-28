package lista3_resolucao;
import java.util.Scanner;

public class Exercicio6 {
    // Faca um programa que leia 10 inteiros e imprima sua media. 

    public static void main(String[] args) {
        double digiteValores, media, soma;
        soma = 0;
        int contador = 1;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 numeros ");
        while(contador <= 10) {     
            digiteValores = scanner.nextDouble();       
            soma += digiteValores;
            contador++;            
        }

        media = soma/10;
        System.out.println("A media dos 10 valores digitados eh " + media);
        scanner.close();           
    }
    
}