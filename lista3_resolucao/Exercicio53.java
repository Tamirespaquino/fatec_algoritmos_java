package lista3_resolucao;

import java.util.Scanner;

public class Exercicio53 {

// Escreva um programa que leia um numero inteiro positivo n e em seguida imprima n
// linhas do chamado Triangulo de Floyd. Para n = 6, temos:
// 1
// 2 3
// 4 5 6
// 7 8 9 10
// 11 12 13 14 15
// 16 17 18 19 20 21

    public static void main(String[] args) {
        int n, m, iteracao;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero inteiro positivo ");
        n = scanner.nextInt();
        iteracao = 1;
        m = 1;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(iteracao + " ");
                iteracao++;
            }
            m++;
            System.out.print("\n");
        }
        scanner.close(); 
    }    
}
