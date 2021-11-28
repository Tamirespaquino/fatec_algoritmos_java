package lista3_resolucao;
public class Exercicio4 {
    // Escreva um programa que declare um inteiro, inicialize-o com 0, e incremente-o de 1000
    // em 1000, imprimindo seu valor na tela, ate que seu valor seja 100000 (cem mil).
    public static void main(String[] args) {

        int inteiro;
        for(inteiro = 0; inteiro <= 100000; ){
            System.out.print(inteiro + "\n");
            // inteiro = inteiro + 1000;
            inteiro += 1000;
        }        
    }   
}
