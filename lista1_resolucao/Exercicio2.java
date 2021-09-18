package lista1_resolucao;
import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main (String args[]) {
        
        int idadeAnos = Integer.parseInt(JOptionPane.showInputDialog("Que tal contar sua idade em anos, meses e dias? Comecando! Em ANOS: "));
        int idadeMeses = Integer.parseInt(JOptionPane.showInputDialog("Que tal contar sua idade em anos, meses e dias? Comecando! Em MESES: "));
        int idadeDias = Integer.parseInt(JOptionPane.showInputDialog("Que tal contar sua idade em anos, meses e dias? Comecando! Em DIAS: "));

        int idadeEmDias = idadeAnos*365 + idadeMeses*30 + idadeDias;

        System.out.println("Sua idade em dias e: " + idadeEmDias);
    }
    
}
