import javax.swing.JOptionPane;

public class Entrada1 {
    public static void main (String args[]) {
        // String frase1;
        // frase1 = JOptionPane.showInputDialog("\nDigite \numa \nfrase");
        // JOptionPane.showMessageDialog(null, "Voce digitou " + frase1);
        // String frase2 = JOptionPane.showInputDialog("Digite outra frase");
        // JOptionPane.showMessageDialog(null, "Agora, voce digitou " + frase2);

        String aux = JOptionPane.showInputDialog("Digite um numero inteiro"); // ele retorna a string "27"
        // int numero1 = Integer.parseInt(aux); // aí, vc pede ajuda para a classe integer converter a string em número
        // JOptionPane.showMessageDialog(null, "Conversao da String em Numero " + numero1);
        // int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro numero inteiro"));
        // JOptionPane.showMessageDialog(null, numero1 + " + " + numero2 + " = " + (numero1 + numero2));

        // aux = JOptionPane.showInputDialog("Digite um numero de ponto flutuante");
        // double x = Double.parseDouble(aux);
        // double y = Double.parseDouble(JOptionPane.showInputDialog("Digite outro numero qualquer"));
        // JOptionPane.showMessageDialog(null, x + " * " + y + " = " + x*y);

        // boolean opcao = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite true/false"));
        // JOptionPane.showMessageDialog(null, "Voce escolheu " + opcao);

        aux = JOptionPane.showInputDialog("Digite uma letra"); // método indireto de conseguir a posição de uma string, ou seja, um caracter
        char letra1 = aux.charAt(0);
        JOptionPane.showMessageDialog(null, "Sua letra eh " + letra1);

        char letra2 = JOptionPane.showInputDialog("Digite outra letra").charAt(0); // método direto de conseguir o caracter da string
        JOptionPane.showMessageDialog(null, "segunda letra " + letra2, "Minha letra", JOptionPane.WARNING_MESSAGE);





    }
}