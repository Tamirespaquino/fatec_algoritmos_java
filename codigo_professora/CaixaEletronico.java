import javax.swing.JOptionPane;

public class CaixaEletronico {
    public static void main(String[] args) {
        int saque = Integer.parseInt(JOptionPane.showInputDialog(null, "qual o valor do saque?", "notas disponiveis: 50, 20, 10, 5, 2, 1", JOptionPane.INFORMATION_MESSAGE));

        int notas50 = saque / 50;
        int resto = saque % 50;

        int notas20 = resto / 20;
        resto = resto % 20;

        int notas10 = resto / 10;
        resto = resto % 10;        

        int notas5 = resto / 5;
        resto = resto % 5;

        int notas2 = resto / 2;
        int notas1 = resto % 2;

        JOptionPane.showMessageDialog(null, "voce vai receber\n" + notas50 + " notas de 50\n" + notas20 + " notas de 20\n" + notas10 + " notas de 10\n" + notas5 + " notas de 5\n" + notas2 + " notas de 2\n" + notas1 + " notas de 1");
    }
}
