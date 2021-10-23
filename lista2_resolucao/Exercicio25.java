package lista2_resolucao;
import java.util.Scanner;

public class Exercicio25 {
    public static void main (String args[]) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite um numero inteiro: ");
        int numero = entrada.nextInt();

        if (numero%3 == 0 && numero%7 == 0) {
            System.out.println("Numero divisivel por 3 e por 7");
        } else {
            System.out.println("Nao eh divisivel por 3 e por 7");
        }

        entrada.close();
    }
    
}
