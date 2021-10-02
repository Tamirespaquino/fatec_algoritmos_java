package codigo_aula_bloco2;
import java.util.Scanner;

public class Menu {
    /* ler uma opção:
    1 - vai ler 2 valores quaisquer e mostrar o primeiro
    elevado ao segundo
    2 - ler um valor qualquer e exibir sua raiz quadrada */

    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite:\n1 - se quiser realizar a potencia\n2 - se quiser realizar a raiz quadrada\n--> ");
        int opcao = input.nextInt();

        if (opcao == 1) {
            System.out.print("Digite o primeiro valor: ");
            double numero1 = input.nextDouble();
            System.out.print("Digite o segundo valor: ");
            double numero2 = input.nextDouble();
            double potencia = Math.pow(numero1, numero2);
            System.out.println(numero1 + " elevado a " + numero2 + " = " + potencia);
        }
        else {
            System.out.print("Digite um valor positivo: ");
            double numero1 = input.nextDouble();
            System.out.println("A raiz quadrada de " + numero1 + " e " + Math.sqrt(numero1));
        }
        
        input.close();
    }

    
}

