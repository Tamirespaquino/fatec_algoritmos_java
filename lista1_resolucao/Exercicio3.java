package lista1_resolucao;
import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main (String args[]) {
        
        int idadeEmDias = Integer.parseInt(JOptionPane.showInputDialog("Sua idade em dias: "));

        int idadeAnos = idadeEmDias/365;
        int idadeMeses = (idadeEmDias%365)/30;
        int idadeDias = (idadeEmDias%365)%30;

        System.out.println("Sua idade em anos, meses e dias sera: anos " + idadeAnos + ", meses: " + idadeMeses + ", dias: " + idadeDias);
    }
    
}

