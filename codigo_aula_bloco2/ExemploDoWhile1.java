package codigo_aula_bloco2;
public class ExemploDoWhile1 {

    // Exibir os números de 1 a 1000
    public static void main(String[] args) {
        int cont = 1;
        do {
            System.out.print(cont + " ");
            cont++;
        } while (cont <= 1000);
    }    
}
