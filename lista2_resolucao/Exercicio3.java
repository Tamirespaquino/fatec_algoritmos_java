package lista2_resolucao;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite o dia de hoje: ");
        int dia = entrada.nextInt();
        System.out.print("Digite o mes de hoje: ");
        int mes = entrada.nextInt();
        System.out.print("Digite o ano de hoje: ");
        int ano = entrada.nextInt();

        System.out.println("A data de hoje eh: " + dia + "/ " + mes + "/ " + ano);

        entrada.close();        
    }    
}