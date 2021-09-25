
import javax.swing.JOptionPane;

public class A1Exercicio2 {

    public static void main (String args[]) {
        int diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Que dia eh hoje? "));
        int mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Em qual mes estamos, mas em numero? "));

        int diasPassaram = (diaAtual - 1) + ((mesAtual - 1)*30);
        int diasPassaramTESTE = (mesAtual * 30) + diaAtual;

        System.out.println("Desde o dia 01 de janeiro de 2021 se passaram " + diasPassaram + " dias");
        System.out.println("TESTE " + diasPassaramTESTE + " dias");

    }
    
}
