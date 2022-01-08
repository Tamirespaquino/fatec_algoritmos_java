import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {
        int v[]; //declaração de um vetor de inteiros
        //System.out.println("tamanho do vetor: " + v.length); -> erro de inicialização
        v = new int[20]; //instanciando um vetor de inteiros com tamanho 20
        System.out.println("tamanho do vetor: " + v.length);

        System.out.print("digite quantos alunos tem na turma: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double notas1[] = new double[n]; //declara e instancia
        System.out.println("tamanho do vetor de notas: " + notas1.length);

        scanner.close();
    }
}
