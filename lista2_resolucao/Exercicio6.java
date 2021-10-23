package lista2_resolucao;
import javax.swing.JOptionPane;

public class Exercicio6 {

    public static void main (String[] args) {
        int classificacao = Integer.parseInt(JOptionPane.showInputDialog("Vamos descobrir sua classificacao? Digite 1 para 'sim' e 2 para 'nao'"));
        
        if (classificacao == 1) {
           
            System.out.println("Legal! Agora eh soh seguir os passos");
            
            double massa, altura;
            
            massa = Double.parseDouble(JOptionPane.showInputDialog("Digite seu peso em kg: "));
            altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura em metros: "));

            double IMC = massa / Math.pow(altura, 2);
            JOptionPane.showMessageDialog (null, "Seu IMC eh: " + IMC);

            if (IMC < 18.5) {
                JOptionPane.showMessageDialog(null, "Sua classificacao eh 'Magreza'");
            } 
            else if (IMC >= 18.5 || IMC < 25.0) {
                JOptionPane.showMessageDialog(null, "Sua classificacao eh 'Saudavel'");
            }
            else if (IMC >= 25.0 || IMC < 30.0) {
                JOptionPane.showMessageDialog(null, "Sua classificacao eh 'Sobrepeso'");
            }
            else if (IMC >= 30.0 || IMC < 35.0) {
                JOptionPane.showMessageDialog(null, "Sua classificacao eh 'Obesidade Grau I'");
            }
            else if (IMC >= 35.0 || IMC < 40.0) {
                JOptionPane.showMessageDialog(null, "Sua classificacao eh 'Obesidade Grau II (severa)'");
            }
            else {
                JOptionPane.showMessageDialog(null, "Sua classificacao eh 'Obesidade Grau III (morbida)'");
            }
        } else {  
            System.out.println("Que pena!");  
            // System.exit(0);  
        }
    }
    
}
