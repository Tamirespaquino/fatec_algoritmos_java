package codigo_aula_bloco2;
import java.util.Scanner;

public class MediaDezValores {
    public static void main (String[] args) {
        // definir que tipo de variavel a ser usada
        double valorDigitado, // armazena os valores digitados
                // soma, // armazena a média calculada
                soma = 0, // declarou aqui para que o soma = soma + valorDigitado desse certo
                media; // controle do laço - contando
        // int cont; // controle do laço - contando
        int cont = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 valores para o calculo da media");
        // cont = 1; // declarar direto na linha 10
        while (cont <= 10) {
            System.out.print(cont + "o: ");
            valorDigitado = scanner.nextDouble();
            soma = soma + valorDigitado;
            cont++;
        }
        media = soma / 10;
        System.out.printf("\nMedia = %.3f\n", media);
        scanner.close();
    }   
}

// só é possível declarar um scanner por código
