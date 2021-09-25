package avalicao_1;
import javax.swing.JOptionPane;

public class A1Exercicio3 {
    public static void main (String args[]) {
        int p = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de camisetas P: "));
        int m = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de camisetas M: "));
        int g = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de camisetas G: "));
        int xg = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de camisetas XG: "));

        // int totalP = p*20;
        // int totalM = m*25;
        // int totalG = g*30;
        // int totalXG = xg*35;
        // int totalCompra = totalP + totalM + totalG + totalXG;
        int totalCompra = p*20 + m*25 + g*30 + xg*35;

        JOptionPane.showMessageDialog(null, "O valor total da compra serah: " + totalCompra);

    }
    
}
