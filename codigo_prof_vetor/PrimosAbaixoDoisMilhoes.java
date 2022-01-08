public class PrimosAbaixoDoisMilhoes {
    public static void main(String[] args) {
        int soma=0;
        for (int m=1; m<=2000000; m++) {
            boolean ePrimo = true;
            int n = 2;
            int raiz = (int) Math.sqrt(m);
            for (; n <= raiz && ePrimo; n++) {
                if (m % n == 0) {
                    ePrimo = false;
                }
            }
            if (ePrimo) {
                //System.out.print(m + " ");
                soma+= m;
            }
        }
        System.out.println("soma dos primos abaixo de 2000000: " + soma);
    }
}