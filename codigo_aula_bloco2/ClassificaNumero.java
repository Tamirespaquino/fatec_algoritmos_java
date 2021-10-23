package codigo_aula_bloco2;
import java.util.Scanner;

public class ClassificaNumero {
    public static void main(String args[]) {
        // Ler um valor qualquer (Scanner/ JOptionPane)
        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite um numero qualquer: ");
        double numero = entrada.nextDouble();
        if (numero == 0) {
            System.out.println("O valor digitado eh zero");
        }
        else if (numero > 0) {
            System.out.println("O valor digitado eh maior que zero");
        }
        else {
            System.out.println("O valor digitado eh menor que zero");
        }

        entrada.close();
    }

}