package p3;
import java.util.Scanner;

public class A3Exercicio3 {
    // Pedir para o usuário digitar 10 valores quaisquer e armazená-los num vetor.
    // Calcular a média dos valores lidos, exibir essa média. 
    // Depois, conte quantos valores estão acima da média e exiba também.
    public static void main(String[] args) {
        float vetor[] = new float[10];
        float soma = 0;
        float media = 0;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite 10 valores quaisquer: ");
        for(int i = 0; i < vetor.length; i++) {
            System.out.println("Digite o " + (i + 1) + "o numero");
            vetor[i] = scanner.nextFloat();  
            soma += vetor[i];           
        }       
        media = soma/10; 
        System.out.printf("A media dos valores lidos sera: %.2f\n", media);     
        
        int contador = 0;
        for(int i = 0; i < vetor.length; i++){
            if(vetor[i] > media){
                System.out.println("Valores acima da media: " + vetor[i]);
                contador++;
            }   
        }
        System.out.println("Existem " + contador + " numeros acima da media dentro deste vetor.");

        scanner.close();
    }
    
}
