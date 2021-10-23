package lista2_resolucao;
import java.util.Scanner;

public class Exercicio31 {

    public static void main (String args[]) {
        Scanner valor = new Scanner (System.in);
        int maior, intermediario, menor, auxiliar;

        System.out.print("Digite um numero inteiro: ");
        menor = valor.nextInt();
        System.out.print("Digite um numero inteiro: ");
        intermediario = valor.nextInt();
        System.out.print("Digite um numero inteiro: ");
        maior = valor.nextInt();

        if (menor > intermediario) {
            auxiliar = menor;
            menor = intermediario;
            intermediario = auxiliar;
        }
        if (maior < intermediario) {
            auxiliar = maior;
            maior = intermediario;
            intermediario = auxiliar;
        }
        if (menor > intermediario) {
            auxiliar = menor;
            menor = intermediario; 
            intermediario = auxiliar; 
        }   

        System.out.println("O maior valor eh: " + maior + "\nO valor intermediario eh: " + intermediario + "\nO menor valor eh: " + menor );

        valor.close();     
    }   
}

