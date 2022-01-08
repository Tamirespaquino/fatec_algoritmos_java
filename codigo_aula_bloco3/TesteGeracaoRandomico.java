package codigo_aula_bloco3;
import java.util.Random;

public class TesteGeracaoRandomico {
    public static void main(String[] args) {
        int[] vetInt = new int[10];
        double[] vetDouble = new double[10];
        boolean[] vetBoolean = new boolean[10];

        Random random = new Random();
        int i;

        // Gerar e exibir o vetor de inteiros
        System.out.println("Vetor de inteiros");
        for(i = 0; i < vetInt.length; i++){
            vetInt[i] = random.nextInt(100);
            System.out.print(vetInt[i] + " ");
        }
        // Gerar e exibir o vetor de booleans
        System.out.println("\nVetor de booleanos");
        for(i = 0; i < vetBoolean.length; i++){
            vetBoolean[i] = random.nextBoolean();
            System.out.print(vetBoolean[i] + " ");           
        }
        // Gerar e exibir o vetor de doubles
        System.out.println("\nVetor de doubles");
        for(i = 0; i < vetDouble.length; i++) {
            vetDouble[i] = Math.random();
            System.out.println(vetDouble[i] + " ");
        }
        
        int[] outroInt = new int[10];
        // Gerar e exibir um vetor de inteiros utilizando o metodo Math.random()
        System.out.println("\nOutro vetor de inteiros");
        for (i = 0; i < outroInt.length; i++){
            outroInt[i] = (int) (Math.random() * 100); // casting - converte um resultado em outro tipo. Aqui ele é um double, mas retorna como inteiro
            System.out.print(outroInt[i] + " ");
        }
    }
    
}
