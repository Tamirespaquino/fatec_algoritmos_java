import java.util.Scanner;

public class QuantosPares {
    // Ler uma lista de valores e verificar quantos são pares

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] v; // declarou variavel, mas nao instanciou
        System.out.print("Digite o tamanho do vetor: ");
        int n = scanner.nextInt();
        v = new int[n];
        int cont = 0;

        // entrada e procecssamento no mesmo laco
        System.out.println("Digite agora " + n + " inteiros: ");
        for(int i = 0; i < v.length; i++){
            System.out.print((i+1) + "o: ");
            v[i] = scanner.nextInt();
            if (v[i] % 2 == 0){
                cont += 1; // cont++
            }
        }

        // saida: o vetor par conferir
        System.out.println("Sua lista: ");
        for(int i = 0; i < v.length; i++) {
            System.out.print(v[i] + " ");
        }
        // saida: quantidade de pares
        System.out.println("\nA lista tem " + cont + " pares");
        
        scanner.close();        
    }    
}
