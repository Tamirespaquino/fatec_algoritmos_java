
import java.util.Scanner;

public class A2Exercicio1 {
    public static void main(String[] args) {
//  Pedir para o usuário digitar um inteiro x qualquer e 
// um inteiro nãonegativo n (fazer as validacoes usando while), calcular x^n
// , utilizando multiplicações sucessivas, usando o comando de laço for
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de x ");
        int x = scanner.nextInt();
        System.out.println("Digite o valor de n ");
        int n = scanner.nextInt();

        while(n < 0){
            System.out.println("O numero n nao pode ser negativo. Digite outro numero ");
            n = scanner.nextInt();
        }       
        
        int potencia = x;

        for(int i = 1; i < n; i++){  
            potencia *= x;
        }

        System.out.println("O valor de x elevado a n sera " + potencia);
        scanner.close();        
    }   
}
