package codigo_professora;
import java.util.Scanner;

public class Exercicio5A {

    public static void main (String args[]){
        Scanner input = new Scanner (System.in);
        System.out.println (" Digite a medida do lado do quadrado: ");
        double lado = input.nextDouble();

        double area = lado * lado;
        double perimetro = lado * 4 ;
        double diagonal = lado * Math.sqrt(2);

        System.out.println (" Area do quadrado e: " + area);
        System.out.println (" Perimetro do quadrado e: " + perimetro);
        System.out.println (" Diagonal do quadrado e: " + diagonal);

        input.close ();

    } 
}
