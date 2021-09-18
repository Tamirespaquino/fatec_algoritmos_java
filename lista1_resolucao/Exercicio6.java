package lista1_resolucao;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Exercicio6 {
    
    public static void main (String args []) {
        Scanner input = new Scanner (System.in);

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura do terreno: "));
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite a base do terreno: "));
        
        double area = base*altura;
        double perimetro = 2*(base+altura);

        System.out.println("A area resultante sera: " + area);
        System.out.println("O perimeto resultante sera: " + perimetro);

        input.close();
    }
}
