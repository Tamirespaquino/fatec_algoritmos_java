package lista2_resolucao;
import javax.swing.JOptionPane;

public class Exercicio19 {

    public static void main (String args[]) {
        double salarioBruto, valorPrestacao, valorMaximo;
        salarioBruto = Double.parseDouble(JOptionPane.showInputDialog("Informe salario bruto: "));
        valorPrestacao = Double.parseDouble(JOptionPane.showInputDialog("Informe valor da prestacao: "));
        
        valorMaximo = 0.3 * salarioBruto;

        if (valorPrestacao <= valorMaximo) {
            System.out.print("Emprestimo concedido");
        } else {
            System.out.print("Valor da prestacao maior que 30% do salario bruto");
        }
    }    
}
