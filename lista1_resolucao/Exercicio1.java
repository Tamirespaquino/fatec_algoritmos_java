package lista1_resolucao;
import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main (String args[]) {

        double x1 = Double.parseDouble(JOptionPane.showInputDialog("Sendo P1(x1, y1), digite o valor de x1: "));
        double y1 = Double.parseDouble(JOptionPane.showInputDialog("Sendo P1(x1, y1), digite o valor de y1: "));
        double x2 = Double.parseDouble(JOptionPane.showInputDialog("Sendo P1(x2, y2), digite o valor de x2: "));
        double y2 = Double.parseDouble(JOptionPane.showInputDialog("Sendo P1(x2, y2), digite o valor de y2: "));

        double a = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        double d = Math.sqrt(a);

        System.out.println("O valor de d sera: " + d);
    }
   
}

