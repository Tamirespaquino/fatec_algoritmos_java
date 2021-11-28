package lista3_resolucao;
import java.util.Scanner;

public class Exercicio35 {

// Faca um programa que some os numeros impares contidos em um intervalo definido
// pelo usuario. O usuario define o valor inicial do intervalo e o valor final deste intervalo
// e o programa deve somar todos os numeros ımpares contidos neste intervalo. Caso o
// usuario digite um intervalo invalido (comecando por um valor maior que o valor final) deve
// ser escrito uma mensagem de erro na tela, Intervalo de valores invalido e o programa
// termina. Exemplo de tela de sa´ıda: Digite o valor inicial e valor final: 5
// 10
// Soma dos ımpares neste intervalo: 21

    public static void main(String[] args){
        double inicioIntervalo, finalIntervalo, somaImpar;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor inicial para o intervalo ");
        inicioIntervalo = scanner.nextInt();
        System.out.print("Digite um valor final para o intervalo ");
        finalIntervalo = scanner.nextInt();
        somaImpar = 0;

        if(finalIntervalo <= inicioIntervalo) {
            System.out.println("Intervalo de valores invalidos. Digite outro intervalo.");
        }
        for(double i = inicioIntervalo; i <= finalIntervalo; i++){
            if(i%2 != 0){
                somaImpar += i;   
            }
        }
        System.out.printf("Soma dos impares neste inveralo: %.2f", somaImpar);
        scanner.close();
    }    
}
