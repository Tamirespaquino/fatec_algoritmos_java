import java.util.Scanner;

public class Exercicio6A {

    public static void main (String args []){
        //entrada
        Scanner entrada = new Scanner (System.in);
        System.out.println("Usuario, digite o valor de a: ");
        double a = entrada.nextDouble();
        System.out.println("Usuario digite o valor de b: ");
        double b = entrada.nextDouble();
        System.out.println("Usuario digite o valor de c: ");
        double c = entrada.nextDouble();
        //processamento
        double x1 = a + b;
        double x2 = b + c;
        double r = Math.pow(x1, 2);
        double s = Math.pow(x2, 2);
        double d = (r + s)/2;
        //saida
        System.out.println("Usuario, o valor de d eh: " + d);
        //libera o recurso
        entrada.close();
    }

}