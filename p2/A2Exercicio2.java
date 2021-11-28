package p2;
import java.util.Scanner;

public class A2Exercicio2 {

    public static void main(String[] args) {
//  Dizemos que um número inteiro é triangular se ele é o produto 
// de 3 números inteiros consecutivos. Por exemplo, 120 é triangular pois 4 * 5 * 6 é igual a 120. 
// Dado um número inteiro positivo n, verificar se n é triangular.

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um numero ");
        int numeroTriangular = scanner.nextInt();
        
        int validacao = 0;
        boolean achou = false;
        for(int n = 1 ; validacao < numeroTriangular; n++){
            validacao = (n * (n+1) * (n+2));               
            
            if(validacao == numeroTriangular){
                achou = true;
                System.out.print(numeroTriangular + " eh um numero triangular.");
            } 
        } 
        if(!achou) {
            System.out.print(numeroTriangular + " nao eh um numero triangular.");
        }
        scanner.close();       
    }
}

