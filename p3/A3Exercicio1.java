package p3;
import java.util.Scanner;

public class A3Exercicio1 {
    // Pedir  para  o  usuário digitar  12  valores inteiros e  armazená-los  num  vetor.
    // Exibir somente os valores ímpares do vetor.
    public static void main(String[] args) {
        int vetor[] = new int[12];
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Escreva 12 numeros para construir o vetor "+ (i+1) + "o: ");
            vetor[i] = scanner.nextInt();
            
        }
        System.out.println("Os numeros impares do vetor sao: ");
        for(int i = 0; i < vetor.length; i++) {
            if(vetor[i]%2 !=0) {
                System.out.println(vetor[i] + " ");
            }
        }  
        scanner.close();
    }    
}
