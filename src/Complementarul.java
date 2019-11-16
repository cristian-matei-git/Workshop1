import java.util.Scanner;

public class Complementarul {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do {
			System.out.print("Introduceti un numar natural: ");
			n = sc.nextInt();
		} while (n < 0);

		sc.close();
		
		int perfect = 10;
		int complement = 0;
		
		while ( n < perfect || n > perfect) {
			if(n < perfect) {
				complement = perfect - n;
				break;
			}
			else if (n > perfect) {
				perfect *= 10;
				continue;
			}
		}
		System.out.println("Complementarul numarului este: " + complement);
	}

}
