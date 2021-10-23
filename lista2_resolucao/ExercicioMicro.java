package lista2_resolucao;
import java.util.Scanner;

public class ExercicioMicro {

    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int arrayNumeros[] = new int[5];
        int numero, maior, menor;
        int contador = 0;

        while (contador < 5) {
            System.out.print("Digite um numero inteiro: ");
            numero = valor.nextInt();
            arrayNumeros[contador] = numero;
            contador++;
        }
        menor = arrayNumeros[0];
        maior = arrayNumeros[0];
        contador = 0;
        while (contador < 5) {
            if (arrayNumeros[contador] < menor){
                menor = arrayNumeros[contador];
            } else if (arrayNumeros[contador] > maior){
                maior = arrayNumeros[contador];
            }
            contador++;
        }    
        System.out.println("O maior valor eh: " + maior + "\nO menor valor eh: " + menor );
        valor.close();   
    }
    
}
