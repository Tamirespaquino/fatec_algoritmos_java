package lista3_resolucao;
public class Exercicio31 {

    // Faca um programa que calcule e escreva o valor de S

    public static void main(String[] args) {
        double somaDenomindador, somaNumerador, somaSeq;
        somaDenomindador = 1;
        somaNumerador = 1;
        somaSeq = 0;

        while(somaNumerador <= 50  && somaDenomindador <= 99){
            somaSeq += somaDenomindador/somaNumerador;
            somaNumerador++;
            somaDenomindador+=2;
        }        
        System.out.printf("O resultado da soma da sequena S sera %.2f ", somaSeq);
    }    
}
