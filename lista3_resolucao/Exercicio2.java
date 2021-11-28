package lista3_resolucao;
public class Exercicio2 {
    // Escreva um programa que escreva na tela, de 1 ate 100, de 1 em 1, 3 vezes. A primeira 
    // vez deve usar a estrutura de repeticao for, a segunda while, e a terceira do while.

    public static void main(String[] args) {
        // int numero, repetidor;

        // for(numero = 1; numero <= 100; numero++) {
        //     for(repetidor = 1; repetidor <= 3; repetidor++){
        //         System.out.print(numero + " ");
        //     }            
        // }

        int numero = 1;
        int repetidor = 0;

        // do{
        //     for(repetidor = 1; repetidor <= 3; repetidor++){
        //         System.out.print(numero + " ");
        //     }
        //     numero++;
        // } while(numero <= 100);

        while (numero <= 100){
            for(repetidor = 1; repetidor <= 3; repetidor++){
                System.out.print(numero + " ");
            }
            numero++;
        }

    }
}

