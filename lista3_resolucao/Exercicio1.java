package lista3_resolucao;
import java.util.Scanner;

public class Exercicio1 {
    public static boolean temOValor(int[] lista, int valor){
        for(int i = 0; i < lista.length; i++){
            System.out.print("Checando i v[i]: ");
            System.out.print(i);
            System.out.print(", ");
            System.out.print(lista[i]);
            System.out.print("\n");
            
            if(lista[i] == valor){
                return true;
            }
        }
        return false;
    }
    public static void inicializar(int[] lista){
        for(int i = 0; i < lista.length; i++){
            lista[i] = 0;
        }
    }
    public static void main(String[] args) {
// Faça um programa que determine e mostre os cinco primeiros multiplos de 3, considerando numeros maiores que 0.
        Scanner entrada = new Scanner (System.in);
        int contador = 0;    
        int[] checandoResposta = new int[5];
        inicializar(checandoResposta);
        do {
            int multiploTres = entrada.nextInt();
            
            if(multiploTres%3 == 0){
                System.out.print(checandoResposta[0]);
                if(!temOValor(checandoResposta, multiploTres)) {
                    System.out.print("Acertou! E agora um numero novo ");
                    checandoResposta[contador] = multiploTres;
                    contador++;
                } else {
                    System.out.print("Acertou! Porem eh numero ja utilizado ");
                }
                
            } else {
                System.out.print("Numero " + multiploTres + " nao eh multiplo de 3. Tente novamente.\n");
            }

            

        } while (contador < 6);

        entrada.close();
    }
}


// int cont = 0;
// int multiplo = 3;
// cont = scanner.nextInt();

// for(cont = 1; cont <= 5; cont++) {
//     if(cont%multiplo == 0) {
//         System.out.print(multiplo + " ");
//     }
// }

// scanner.close();