package lista3_resolucao;
import java.util.Scanner;

public class Exercicio13 {
    // Faca um programa que leia um numero inteiro positivo par N e imprima todos os numeros
    // pares de 0 ate N em ordem crescente.

    public static void main(String[] args) {
        int N, listaNum;
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();
        
        if(N >= 0 && N%2 == 0){
            for(listaNum = 0; listaNum <= N; listaNum++){
                System.out.print(listaNum + "\n");
            }
        } else {
            System.out.println("Digite um numero inteiro positivo e par.");
        }
        scanner.close();
    }
}
