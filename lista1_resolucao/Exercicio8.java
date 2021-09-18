package lista1_resolucao;
import java.util.Scanner;

public class Exercicio8 {
    public static void main (String args[]) {
        Scanner entrada = new Scanner (System.in);
        System.out.print("Digite o valor da gasolina: ");
        double precoGasolina = entrada.nextDouble();
        System.out.print("Digite o valor total gasto: ");
        double valorGasto = entrada.nextDouble();

        double litrosGasolina = valorGasto / precoGasolina;

        System.out.println("Voce conseguiu colocar " + litrosGasolina + " litros de gasolina");

        entrada.close();
    }
    
}
