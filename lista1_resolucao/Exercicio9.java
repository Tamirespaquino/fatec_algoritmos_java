package lista1_resolucao;
import java.util.Scanner;

public class Exercicio9 {

    public static void main (String args[]) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Defina seu salario: ");
        double salario = entrada.nextDouble();

        double aumento = salario + salario*0.15;
        double salarioFinal = aumento - aumento*0.08;

        System.out.println("Salario inicial " + salario);
        System.out.println("Salario com aumento " + aumento);
        System.out.println("Salario final " + salarioFinal);

        entrada.close();
    }
    
}
