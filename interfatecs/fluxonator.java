package interfatecs;
import java.util.Scanner;

public class fluxonator {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int casosDeTeste = 0;
		String entrada;
		String saida = "";

		boolean alavancaL1 = true;
		boolean alavancaL2 = true;
		boolean alavancaL3 = true;

		casosDeTeste = scanner.nextInt();

		for (int i = 0; i < casosDeTeste; i++) {

			System.out.print((i + 1) + " " + casosDeTeste);
			entrada = scanner.next();

			if (entrada.equals("A")) {
				if (alavancaL1) {
					saida += "D";

					alavancaL1 = !alavancaL1;				

				}else if(alavancaL1 == false && alavancaL2) {
					saida += "D";

					alavancaL1 = !alavancaL1;
					alavancaL2 = !alavancaL2;
					
				} else if (alavancaL2 == false) {
					saida += "E";

					alavancaL1 = !alavancaL1;
					alavancaL2 = !alavancaL2;
				}
			}else if (entrada.equals("B")) {
				if (alavancaL2) {
					saida += "D";

					alavancaL2 = !alavancaL2;

				} else if (alavancaL2 == false) {
					saida += "E";

					alavancaL2 = !alavancaL2;
				}
			}else if (entrada.equals("C")) {
				if (alavancaL3 && alavancaL2) {
					saida += "D";

					alavancaL3 = !alavancaL3;
					alavancaL2 = !alavancaL2;

				} else if (alavancaL3 == false) {
					saida += "E";

					alavancaL3 = !alavancaL3;
				}
			}

		}

		System.out.println(saida);
	}

	scanner.close();

}