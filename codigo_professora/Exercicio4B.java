import javax.swing.JOptionPane;

public class Exercicio4B {
    public static void main (String[] args) {
        int n = Integer.parseInt(JOptionPane.showInputDialog("digite um inteiro:"));

        int suc = n+1;
        int ant = n-1;

        JOptionPane.showMessageDialog(null, "antecessor de " + n + " = " + ant);
        JOptionPane.showMessageDialog(null, "sucessor de " + n + " = " + suc);
    }
}
