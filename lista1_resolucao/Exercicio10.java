package lista1_resolucao;
import java.util.Scanner;

public class Exercicio10 {

    public static void main (String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero de ate 3 digitos: ");
        int numeroInteiro = entrada.nextInt();

        int centena = numeroInteiro / 100;
        int dezena = ((numeroInteiro % 100) / 10);
        int unidade = ((numeroInteiro % 100) % 10);

        System.out.println("O valor da centena sera: " + centena);
        System.out.println("O valor da dezena sera: " + dezena);
        System.out.println("O valor da unidade sera: " + unidade);
        entrada.close();

    }
    
}
