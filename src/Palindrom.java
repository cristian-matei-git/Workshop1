import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n;
		
		do {
			System.out.print("Introduceti un numar natural: ");
			n = sc.nextInt();
		} while (n < 0);
		
		sc.close();
		
		int lastDigit = 0;
		int copyN = n;
		int symetric = 0;
		
		while(copyN != 0) {
			
			lastDigit = copyN % 10;
			symetric = (symetric * 10) + lastDigit;
			copyN /= 10;
			
		}

		if(n == symetric) {
			System.out.println("Palindrom!");	
		}
		else System.out.println("Nu este palindrom.");

	}

}
