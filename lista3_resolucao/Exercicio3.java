package lista3_resolucao;
public class Exercicio3 {
    // Faca um algoritmo utilizando o comando while que mostra uma contagem regressiva
    // na tela, iniciando em 10 e terminando em 0. Mostrar uma mensagem em string dizendo fim apos a
    // contagem.

    public static void main(String[] args) {
        int contRegressiva = 10;

        while(contRegressiva >= 0) {
            System.out.println("FIM! " + contRegressiva);
            contRegressiva--;
        }        
    }    
}
