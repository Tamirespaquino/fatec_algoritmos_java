package p3;
import java.util.Random;

public class A3Exercicio2 {
    // Gerar 2 vetores de 10 posições cada um, com valores randômicos de 0 a 99.
    // Exibir o maior valor de cada posição entre eles.

    public static void main(String[] args) {
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        Random random = new Random();

        for(int i = 0; i < vetor1.length; i++) {
            vetor1[i] = random.nextInt(100);
            System.out.println("O numero " + (i + 1) + "o " + "do vetor 1 eh " + vetor1[i]);
        }
        for(int i = 0; i < vetor2.length; i++) {
            vetor2[i] = random.nextInt(100);
            System.out.println("O numero " + (i + 1) + "o " + "do vetor 2 eh " + vetor2[i]);            
        }
        for(int i = 0; i < 10; i++) {
            if(vetor1[i] > vetor2[i]) {
                System.out.println("O maior valor entre os dois vetores nesta posicao eh: " + vetor1[i]);
            } else if(vetor2[i] > vetor1[i]) {
                System.out.println("O maior valor entre os dois vetores nesta posicao eh: " + vetor2[i]);
            }
        }
    }    
}
