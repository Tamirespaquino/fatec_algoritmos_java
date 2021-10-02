package codigo_professora;
import javax.swing.JOptionPane;

public class Exercicio6B {
    public static void main(String[] args) {
        //entrada
        double a = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("digite o valor de c:"));

        //processamento
        double d = (Math.pow(a+b, 2) + Math.pow(b+c, 2)) / 2;

        //saída
        JOptionPane.showMessageDialog(null, "d = " + d);
    }
}
