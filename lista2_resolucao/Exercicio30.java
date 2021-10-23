package lista2_resolucao;
import java.util.Scanner;

public class Exercicio30 {

    public static void main (String args[]) {
        Scanner valor = new Scanner(System.in);
        System.out.print("Primeiro numero: ");
        int num1 = valor.nextInt();
        System.out.print("Segundo numero: ");
        int num2 = valor.nextInt();
        System.out.print("Terceiro numero: ");
        int num3 = valor.nextInt();

        if (num1 > num2 && num1 > num3) {
            int maior = num1;
            System.out.println("Variavel maior vale " + maior);
        } else if (num2 > num1 && num2 > num3){
            int maior = num2;
            System.out.println("Variavel maior vale " + maior);
        }
        else if (num3 > num1 && num3 > num2){
            int maior = num3;
            System.out.println("Variavel maior vale " + maior);
        }
        valor.close();
    }    
}
