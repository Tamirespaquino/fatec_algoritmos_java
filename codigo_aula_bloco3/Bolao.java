package codigo_aula_bloco3;
import java.util.Random;
import java.util.Scanner;

public class Bolao {
    public static void main(String[] args) {
        // Construindo uma matriz

        int[][] jogos;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite o numero de jogos: ");
        int n = scanner.nextInt();

        jogos = new int[n][6];

        for (int i = 0; i < n; i++) {
            for(int j = 0; j < 6; j++){
                jogos[i][j] = random.nextInt(60) + 1;
            }
        }
        System.out.print("Seus jogos:\n");
        for(int i = 0; i < n; i++) {
            System.out.print("Jogo " + (i + 1) + ": ");
            for(int j = 0; j < 6; j++) {
                System.out.print(jogos[i][j] + " ");
            }
            System.out.println();
        }
        scanner.close();        
    }    
}
