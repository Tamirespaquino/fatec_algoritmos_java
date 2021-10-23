import java.util.Scanner;

public class maior {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int a = entrada.nextInt();
        int b = entrada.nextInt();
        int c = entrada.nextInt();

        if (a > b && a > c){
            System.out.println(a);
        } else if (b > a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
        entrada.close();
    }   

}
