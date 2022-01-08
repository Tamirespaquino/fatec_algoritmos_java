package lista4_resolucao;
import java.util.Scanner;

public class Exercicio4 {
//     Faca um programa que leia um vetor de 8 posicoes e, em seguida, leia tambem dois va
//lores X e Y quaisquer correspondentes a duas posicoes no vetor. Ao final seu programa 
// devera escrever a soma dos valores encontrados nas respectivas posicoes X e Y .

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vetor[] = new double[8];

        for(int i = 0; i < vetor.length; i++){
            System.out.println("Digite um numero qualquer ");
            vetor[i] = scanner.nextDouble();
        }
        System.out.println("Digite dois numero de 0 a 7 correspondendo a posicao no vetor ");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        if((x >= 0 && x <= 7) && (y >= 0 && y <= 7)) {
            System.out.println("Voce digitou o numero dentro do intervalo. Vamos continuar.");
            System.out.println("A soma das duas posicoes escolhidas sera: " + (vetor[x] + vetor[y]));
        } else {
            System.out.println("Digite outro numero.");
        }
        scanner.close();
    }
}
