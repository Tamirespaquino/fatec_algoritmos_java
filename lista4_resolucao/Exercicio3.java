package lista4_resolucao;
import java.util.Scanner;

public class Exercicio3 {

//     Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado das 
// componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem
// 10 elementos cada. Imprimir todos os conjuntos.
    
    public static void main(String[] args) {
        double[] vetor = new double[10];
        double[] vetorQuadrados = new double[10];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i< 10; i++) {
            System.out.print("Escreva 10 numeros para construir o vetor "+ (i+1) + "o: ");
            vetor[i] = scanner.nextDouble();
        }

        for(int i = 0; i < 10; i++) {
            vetorQuadrados[i] = (int)Math.pow(vetor[i], 2);
            // System.out.print(vetorQuadrados[i] + " ");
        }

        for(int i = 0; i < 10; i++) {
            System.out.println(vetor[i] + " -> " + vetorQuadrados[i]);
        }
        scanner.close();
    }
}
