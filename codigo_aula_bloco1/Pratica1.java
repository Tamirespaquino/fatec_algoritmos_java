package codigo_aula;
import javax.swing.JOptionPane;
public class Pratica1{
    public static void main (String args[]){
        
        double peso = Double.parseDouble(JOptionPane.showInputDialog ("Digite seu peso em KG:"));
        JOptionPane.showMessageDialog (null, "Voce digitou: " + peso);
        
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em M:"));
        JOptionPane.showMessageDialog (null, "Voce digitou: " + altura);
        
        JOptionPane.showMessageDialog ( null, "Seu IMC: " + peso / (altura*altura) + "\n" + " Veja abaixo em qual faixa seu IMC se encaixa \n " + 
        "Abaixo de 18 = Baixo peso. \n " + "De 18,5 ate 24,9 = Peso Normal. \n" + "De 25,0 ate 29,9 = Sobrepeso. \n" + "De 30,0 ate 34,9 = Obesidade Grau 1." );
    }
}

    
        

    











