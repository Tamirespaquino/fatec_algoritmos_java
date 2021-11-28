package p2;

import java.util.Scanner;

public class A2Exercicio4 {

    public static void main(String[] args) {
// Fazer um programa que recebe o salário-base de um funcionário, 
// calcula e mostra o salário novo, considerando que 
// se o salário atual for menor 
// ou igual a R$2.000,00, o aumento é 12%, senão é 10%

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu salario atual: ");
        double salario = scanner.nextDouble();        
        double salarioFinal;

        if(salario <= 2000.0){
            salarioFinal = salario + salario*0.12;
            System.out.printf("Seu salario com aumento sera: R$ %.2f ", salarioFinal);
        } else {
            salarioFinal = salario + salario*0.10;            
            System.out.printf("Seu salario com aumento sera: R$ %.2f ", salarioFinal);
        }
        scanner.close();        
    }    
}
