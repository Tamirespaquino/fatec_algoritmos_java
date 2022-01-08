package lista4_resolucao;
import java.util.Scanner;

public class Exercicio10 {
//     Faca um programa para ler a nota da prova de 15 alunos e armazene num vetor, calcule
// e imprima a media geral. 

    public static void main(String[] args) {
        float[] notaProva = new float[15];
        float soma = 0;
        float media = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < notaProva.length; i++) {
            System.out.println("Digite a nota do " + (i+1) + "o aluno: ");
            notaProva[i] = scanner.nextFloat();
            soma += notaProva[i];
            media = soma/15;
        }       
            System.out.printf("A media da sala sera: %.1f", media);
        
        scanner.close(); 
    }
}
