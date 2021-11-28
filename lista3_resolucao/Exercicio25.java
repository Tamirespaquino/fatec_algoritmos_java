package lista3_resolucao;
public class Exercicio25 {

//Faca um programa que some todos os numeros naturais abaixo de 1000 que sao multiplos
// de 3 ou 5.

    public static void main(String[] args) {
        int numNatural = 0;
        int soma = 0;

            do{
                if(numNatural%3 == 0 || numNatural%5 == 0){
                    soma =+ numNatural;
                    numNatural++;
                }  
                numNatural++;
            } while(numNatural < 1000); 
            
            System.out.println("A soma dos numeros sera " + soma);          
    }
}
