import java.util.Scanner;

public class Menu {
    /* Ler uma opção:
    1 - Ler um número qualquer e, se o número for positivo, calcular
    e mostrar a raiz quadrada. Se ele for negativo, calcular e mostrar
    o quadrado dele.
    2 - Ler 2 números e exibir o maior.
    3 - Se o usuário escolher opção diferente, retorne opção inválida*/

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 1 ou 2 para iniciar o programa surpresa: ");
        int opcao = input.nextInt();

        if (opcao == 1) {
            System.out.print("Digite um numero qualquer: ");
            double numero = input.nextDouble();
            if (numero >= 0) {
                double raiz = Math.sqrt(numero);
                System.out.println("Raiz quadrada de " + numero + " = " + raiz);
            }
            else {
                double quadrado = numero * numero;
                System.out.println("Quadrado de " + numero + " = " + quadrado);
            }
        }
        else if (opcao == 2) {
            System.out.print("Digite o primeiro valor: ");
            double valor1 = input.nextDouble();
            System.out.print("Digite o segundo valor: ");
            double valor2 = input.nextDouble();

            if (valor1 >= valor2) {
                System.out.println("Maior valor digitado: " + valor1);
            }
            else {
                System.out.println("Maior valor digitado: " + valor2);
            }
        }
        else {
            System.out.println("Opcao invalida");
        }
        input.close();
    }
}
