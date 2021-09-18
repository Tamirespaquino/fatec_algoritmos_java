package lista1_resolucao;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercicio11 {

    public static void main (String args[]) {

        Scanner input = new Scanner (System.in);

        double pi = 3.14;
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da pizza: "));
        
        double areaPizza = (raio*raio*pi);

        System.out.println("A area da pizza sera: " + areaPizza);

        input.close();
    }
    
}
