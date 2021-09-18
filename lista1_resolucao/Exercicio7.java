package lista1_resolucao;
import java.util.Scanner;

public class Exercicio7 {
    public static void main (String args[]) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Quantos paes voce gostaria de comprar? ");
        double paes = entrada.nextDouble();
        System.out.print("Quantas broas voce gostaria de comprar? ");
        double broas = entrada.nextDouble();

        double broasTotal = broas * 1.50;
        double paesTotal = paes * 0.12;
        double totalArrecadado = broasTotal + paesTotal;
        double poupanca = totalArrecadado * 0.10;

        System.out.println("Valor total arrecadado: " + totalArrecadado);
        System.out.println("Valor que sera guardado: " + poupanca);


        entrada.close();

    } 
    
}
