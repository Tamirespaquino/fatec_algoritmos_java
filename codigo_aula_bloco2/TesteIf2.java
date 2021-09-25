import javax.swing.JOptionPane;

// import java.util.Scanner;

public class TesteIf2 {
    public static void main (String args[]) {
        // /* ler 2 inteiros e dizer qual o maior valor digitado:
        // 8 6 -> 8
        // 7 20 -> 20
        // 4 4 -> 4 */

        // Scanner entrada = new Scanner (System.in);

        // int numero1 = entrada.nextInt();
        // int numero2 = entrada.nextInt();

        // if (numero1 >= numero2) {
        //     System.out.println("O primeiro inteiro eh maior " + numero1);
        // } 
        // else {
        //     System.out.println("O segundo inteiro eh maior " + numero2);
        // }

        // entrada.close();

        int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor "));
        int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor"));

        if (a >= b) {
            JOptionPane.showMessageDialog(null, "O maior valor digitado foi " + a);
        }
        else {
            JOptionPane.showMessageDialog(null, "O maior valor digitado foi " + b);
        }

    }
}
