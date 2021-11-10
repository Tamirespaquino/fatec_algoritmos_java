package interfatecs;
import java.util.Scanner;

public class estacionamento {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String bicicletario [] = new String[15];
		
		boolean completo = false;
		int ascii = 0;
		
		
		
		do {
			String bike = scanner.next();	
			
			if (bike.equals("a")) {
				break;
			}
			
			for (int i = 1; i <= 7; i++) {
				char a = bike.charAt(i-1);
				ascii = ascii + (int)a;
			}
			
			ascii = (ascii%15)+1;
			
			if (ascii > 0 && ascii <= 14 && bicicletario[ascii] == null) {
				bicicletario[ascii] = bike;
			}
			
			/*for (int i = 0; i < bicicletario.length; i++){
				if(bicicletario[i] != null) {
					completo = true;
				}
			}*/
		
		} while(completo == false);
		
		for(int i = 0; i < bicicletario.length; i++) {
			if(bicicletario[i]!=null)
			System.out.println(i + " " + bicicletario[i]) ;
		}
		
		scanner.close();
	}
}