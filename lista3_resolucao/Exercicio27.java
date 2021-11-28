package lista3_resolucao;
import java.util.Scanner;

public class Exercicio27 {

//Em Matematica, o numero harmonico designado por H(n) define-se como sendo a soma
// da serie harmonica:
// H(n) = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor para n: ");
        int n = scanner.nextInt();
        double soma = 1;

        for(double i = 2; i <= n; i++){
            soma += (1/i);
        }
        System.out.printf("O numero harmonico encontrado eh %.2f", soma);

        scanner.close();
        
    }

    
}
