import java.util.Scanner;

public class Exercicio7A {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite o primeiro valor: ");
        double a = entrada.nextDouble();
        System.out.print("Digite o segundo valor: ");
        double b = entrada.nextDouble();
        System.out.print("Digite o terceiro valor: ");
        double c = entrada.nextDouble();

        double media = (a + b + c) / 3;
        System.out.println("A media aritmetica " + media);
        entrada.close();
    }
}
