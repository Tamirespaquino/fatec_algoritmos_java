package lista4_resolucao;
public class DesafioEx7 {
//     Gerar e imprimir uma matriz de tamanho 10 x 10, onde seus elementos sao da forma: 
// A[i][j] = 2i + 7j − 2 se i < j;
// A[i][j] = 3i^2 − 1 se i = j;
// A[i][j] = 4i^3 − 5j^2 + 1 se i > j

    public static void main(String[] args) {
        int A[][] = new int[10][10];
        
        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A.length; j++) {
                if (i < j){
                    A[i][j] = (2 * i) + (7 * j) - 2;
                    System.out.println("A matriz A1 sera: " + A[i][j]);
                } else if (i == j){
                    A[i][j] = (3 * ((int)Math.pow(i,2))) - 1;
                    System.out.println("A matriz A2 sera: " + A[i][j]);
                } else if (i > j) {
                    A[i][j] = (4 * ((int)Math.pow(i,3))) - (5 * ((int)Math.pow(j,2))) + 1;
                    System.out.println("A matriz A3 sera: " + A[i][j]);
                }
            }
        }

        for(int i = 0; i < A.length; i++) {
            for(int j = 0; j < A.length; j++) {
                System.out.println("A matriz Afinal sera: " + A[i][j]);
            }
        }
    }

   
}
