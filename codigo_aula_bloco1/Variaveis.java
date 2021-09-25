package codigo_aula;
import javax.swing.JOptionPane;

public class Variaveis {
    public static void main (String args[]) {
        // declaração de variáveis
        int numeroInteiro;
        double duplaPrecisao;
        boolean variavelLogica;
        char letra;
        String palavra;
        // atribuição de valores
        numeroInteiro = 135;
        duplaPrecisao = 4.56;
        variavelLogica = true;
        letra = 'h'; // char é com aspas simples
        palavra = "algoritmos"; // string é com aspas duplas
        // exibir os valores das variáveis
        System.out.println ("Meu valor inteiro: " + numeroInteiro);
        System.out.println ("A letra e: " + letra + " a palavra e " + palavra);
        JOptionPane.showMessageDialog(null, "meu ponto flutuante = " + duplaPrecisao + "\nvalor logico: " + variavelLogica);
        // declarar e atribuir valores a variáveis
        int a = 5, b = 3;
        System.out.println ("Soma = " + a+b); // o problema aqui é que o java entende que
        // é uma concatenação e não uma soma. Para somar mesmo teria que ser entre parenteses
        // como abaixo
        System.out.println ("Soma = " + (a+b));
        System.out.println ("Multiplicacao = " + a*b);
        // a multiplicação nao tem problema porque ela sobressai a soma, tem precedência.
        System.out.println ("Divisao inteira: " + a/b);
        System.out.println ("Divisao ponto flutuante: " + a/duplaPrecisao);
        // casting -> transformar um inteiro em double
        System.out.println ("Divisao convertidas = " + (double)a/b);


        


    }
}
