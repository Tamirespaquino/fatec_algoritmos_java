import java.util.Scanner;

public class Media {
    /* ler duas notas de um aluno, calcular a média e, se a média
    for igual ou maior a 6,0, exibi-la e colocar a mensagem "aprovado". 
    Caso contrário, colocar mensagem "reprovado"*/

    public static void main (String args[]) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite sua primeira nota: ");
        double nota1 = input.nextDouble();
        System.out.print("Digite sua segunda nota: ");
        double nota2 = input.nextDouble();

        double media = (nota1 +  nota2) / 2;

        if (media >= 6.0) {
            System.out.println("Sua media eh: " + media + "\nesta aprovado");
        }
        else {
            System.out.println("Sua media eh: " + media + "\nesta reprovado");
        }

        input.close();
    }    
    
}
