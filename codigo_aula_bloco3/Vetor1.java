package codigo_aula_bloco3;
import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos valores precisa somar? ");
        int n = scanner.nextInt();

        //declarando e instanciando um vetor com o tamanho que o usuario escolheu
        double[] vetor = new double[n];

        // entrada: leitura de cada valor que será armazenado no vetor
        for(int i = 0; i < vetor.length; i++){
            System.out.print("Digite o " + (i+1) + "o valor: ");
            vetor[i] = scanner.nextDouble();
        }

        // processamento: soma dos valores
        double soma = 0.0;
        for(int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }

        // saida: teste para ver se a leitura deu certo
        System.out.println("\nVoce digitou a seguinte lista: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        // saida: exibir a soma calculada e sem formatacao
        System.out.println("\nSoma dos valores: " + soma);
        // outra maneira com print formatado
        System.out.printf("\nSoma dos valores: %.3f\n", soma);
        // outra maneira com formatacao de string
        System.out.println("Soma dos valores: " + String.format("%.3f", soma));
        scanner.close();
    }
}