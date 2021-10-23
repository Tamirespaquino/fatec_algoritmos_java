package lista2_resolucao;
import javax.swing.JOptionPane;

public class Extra {

    public static void main(String[] args) {
        double a, b, quadrado, raiz;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite um numero: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero, mas diferente de a: "));

        if (a > b) {
            raiz = Math.sqrt(a); 
            quadrado = Math.pow(b, 2);
            JOptionPane.showMessageDialog(null, "A raiz de " + a + " vale " + raiz);
            JOptionPane.showMessageDialog(null, "O quadrado de " + b + " vale " + quadrado);
        } else if (b > a) {
            raiz = Math.sqrt(b);
            quadrado = Math.pow(a, 2);
            JOptionPane.showMessageDialog(null, "A raiz de " + b + " vale " + raiz);
            JOptionPane.showMessageDialog(null, "O quadrado de " + a + " vale " + quadrado);
        }         

    }
    
}
