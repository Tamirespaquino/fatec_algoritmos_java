package lista1_resolucao;
import javax.swing.JOptionPane;

public class Exercicio5 {

    public static void main (String args[]) {
        
        double a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de a: "));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de b: "));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de c: "));
        double d = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de d: "));
        double e = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de e: "));
        double f = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de f: "));

        double x = (c*e) - (b*f)/(a*e) - (b*d);
        double y = (a*f) - (c*d)/(a*e) - (b*d);

        System.out.println("O valor de x e: " + x);
        System.out.println("O valor de y e: " + y);





    }
    
}
