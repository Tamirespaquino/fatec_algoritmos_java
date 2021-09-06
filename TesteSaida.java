import javax.swing.JOptionPane;

public class TesteSaida {
    public static void main (String args[]) {
        System.out.println ("Mensagem na linha de comando");
        JOptionPane.showMessageDialog (null, "Mensagem na janela pop-up");

        System.out.print ("tudo");
        System.out.print ("junto\n");

        System.out.println ("muda");
        System.out.println ("linha");

        JOptionPane.showMessageDialog (null, "teste", "titulo", JOptionPane.ERROR_MESSAGE);
        // usa . porque é para buscar, dentro do JOptionPane, essa classe.

    }
    
}
