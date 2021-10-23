package lista2_resolucao;
import javax.swing.JOptionPane;

public class Exercicio11 {

    public static void main (String[] args) {
        double valorInicial, j;
        int n;
        valorInicial = Double.parseDouble(JOptionPane.showInputDialog("Valor que deve para cartao de credito: "));
        n = Integer.parseInt(JOptionPane.showInputDialog("Quantos meses se passaram sem pagar a divida: "));
        j = Double.parseDouble(JOptionPane.showInputDialog("Qual a taxa de juros: "));

        double valorFinal = valorInicial * (1 + j/100) * n;

        System.out.println("O valor que voce deve para o banco eh: " + valorFinal);
    }
    
}
