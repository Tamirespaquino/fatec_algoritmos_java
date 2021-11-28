package lista3_resolucao;
import java.util.Scanner;

public class Exercicio20 {

// Ler uma sequencia de numeros inteiros e determinar se eles sao pares ou nao. Devera
// ser informado o numero de dados lidos e numero de valores pares. O processo termina 
// quando for digitado o numero 1000.

    public static void main(String[] args) {
        int numEntrada, contaEhPar, contador;
        Scanner scanner = new Scanner(System.in);

        contador = contaEhPar = 0;

            do{
                System.out.print("Digite um numero ");
                numEntrada = scanner.nextInt();
                contador++;

                if(numEntrada%2 == 0){
                    contaEhPar++;
                }                
                System.out.println("Digite um novo numero: ");

            } while( numEntrada != 1000);
            
            System.out.println("Foram digitados " + contador + " numeros e " + contaEhPar + " numeros sao pares.");

            scanner.close();            
    }
    
}
