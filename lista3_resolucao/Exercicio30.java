package lista3_resolucao;
import java.util.Scanner;

public class Exercicio30 {

//Faca programas para calcular as seguintes sequencias:
// 1 + 2 + 3 + 4 + 5 + ... + n
// 1 − 2 + 3 − 4 + 5 - ... + (2n − 1)
// 1 + 3 + 5 + 7 + ... + (2n − 1)

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double n, somaSeq1, somaSeq2, somaSeq3;
        System.out.print("Digite um numero para encontrar as sequencias: ");
        n = entrada.nextInt();
        somaSeq1 = 0;
        somaSeq2 = 0;
        somaSeq3 = 0;

        for(double i = 1; i <= n; i++){
            somaSeq1 += i;    
        }
        System.out.printf("A somatoria da primeira sequencia sera: %.2f\n", somaSeq1);

        for(double i = 1; i <= (2*n - 1); i++){
            if(i%2 != 0){
                somaSeq2 += i;
            } else {
                somaSeq2 -= i;
            }
        }
        System.out.printf("A somatoria da segunda sequencia sera: %.2f\n", somaSeq2);

        for(double i = 1; i <= (2*n - 1); i+=2){
            somaSeq3 += i;
        }
        System.out.printf("A somatoria da terceira sequencia sera: %.2f\n", somaSeq3);

        entrada.close();        
    }    
}
