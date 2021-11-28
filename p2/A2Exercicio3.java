package p2;
import java.util.Scanner;

public class A2Exercicio3 {

    public static void main(String[] args) {
// Escrever um programa para ler as coordenadas (x, y) de um 
// ponto no sistema cartesiano. Exibir se ele pertence a algum eixo, ou o quadrante a que ele 
// pertence
        Scanner scanner = new Scanner(System.in);        
        System.out.print("Digite a coordenada x: ");
        double coordenadaX = scanner.nextDouble();
        System.out.print("Digite a coordenada y: ");
        double coordenadaY = scanner.nextDouble();        
        
        if(coordenadaX == 0 && coordenadaY == 0) {
            System.out.println("As coordenadas pertencem ao ponto de origem (" + coordenadaX + ", " + coordenadaY + ")");
        } else if(coordenadaX == 0) {
            System.out.println("As coordenadas se encontram no eixo Y (" + coordenadaX + ", " + coordenadaY + ")");
        } else if(coordenadaY == 0) {
            System.out.println("As coordenadas se encontram no eixo X (" + coordenadaX + ", " + coordenadaY + ")");
        } else if(coordenadaX > 0 && coordenadaY > 0) {
            System.out.println("As coordenadas se encontram no primeiro quadrante (" + coordenadaX + ", " + coordenadaY + ")");
        } else if(coordenadaX < 0 && coordenadaY > 0) {
            System.out.println("As coordenadas se encontram no segundo quadrante (" + coordenadaX + ", " + coordenadaY + ")");
        } else if(coordenadaX < 0 && coordenadaY < 0) {
            System.out.println("As coordenadas se encontram no terceiro quadrante (" + coordenadaX + ", " + coordenadaY + ")");
        } else if(coordenadaX > 0 && coordenadaY < 0) {
            System.out.println("As coordenadas se encontram no quarto quadrante (" + coordenadaX + ", " + coordenadaY + ")");
        }


        scanner.close();

    }
    
}
