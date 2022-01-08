package codigo_aula_bloco3;
import java.util.Random;

public class MegaSena {
    public static void main(String[] args) {
        int[] jogo = new int[6];
        Random random = new Random();

        System.out.println("Vamos ficar ricos!");
        for(int i = 0; i < jogo.length; i++) {
            jogo[i] = random.nextInt(60) + 1;
            System.out.print(jogo[i] + " ");
        }
    }
}
