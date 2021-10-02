package codigo_aula_bloco2;
import java.util.Scanner;

public class TesteIf1 {
    public static void main (String args []) {
        /* pedir um valor inteiro para o usuário e verificar se ele é
        positivo (>=0) ou negativo */
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();

        if (numero >= 0) {
            System.out.println("O valor digitado eh positivo");
        }
        else {
            System.out.println("Caso contrario, o valor digitado eh negativo");
        }

        entrada.close();
    }
    
}
