package lista1_resolucao;
import javax.swing.JOptionPane;

public class Exercicio4 {
    
    public static void main (String args[]) {
        
        double custoFabrica = Double.parseDouble(JOptionPane.showInputDialog("Custo da fabrica: "));
        double distribuidor = custoFabrica * 0.28;
        double imposto = custoFabrica * 0.45;

        double custoCarroNovo = custoFabrica + distribuidor + imposto;
        System.out.println("Porcentagem do distribuidor: " + distribuidor);
        System.out.println("Porcentagem de impostos: " + imposto);
        System.out.println("Valor final do seu carro novo: " + custoCarroNovo);

    }
}



