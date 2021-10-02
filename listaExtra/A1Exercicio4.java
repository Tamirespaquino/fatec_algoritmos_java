package listaExtra;
public class A1Exercicio4 {
    public static void main (String args[]) {
        double x = 12.00;
        double y = 10.00;
        double z = 15.00;
        double premio = 3000000.00;

        double totalInvestido = x+y+z;

        double xFinal = premio * (x/totalInvestido);
        double yFinal = premio * (y/totalInvestido);
        double zFinal = premio * (z/totalInvestido);
        double total = xFinal + yFinal + zFinal;

        System.out.println("O primeiro contribuinte ganhara: " + xFinal);
        System.out.println("O segundo contribuinte ganhara: " + yFinal);
        System.out.println("O terceiro contribuinte ganhara: " + zFinal);
        System.out.println("Para comprovacao, o valor total dos 3 sera: " + total);
    
    }
    
}
