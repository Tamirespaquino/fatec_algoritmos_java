package lista4_resolucao;
import java.util.Scanner;

public class Exercicio8 {
//     Crie um programa que le 6 valores inteiros e, em seguida, mostre na tela os valores lidos 
// na ordem inversa.

    public static void main(String[] args) {
        int[] vetor = new int[6];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Construindo o vetor. Digite o " + (i+1) + "o valor ");
            vetor[i] = scanner.nextInt();
        }
        for(int i = 5; i >= 0; i--) {
            System.out.println("Os valores na ordem inversa sera: " + vetor[i]);
        }
        scanner.close();        
    }
}
