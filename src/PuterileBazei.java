import java.util.Scanner;

public class PuterileBazei {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Introduceti o baza: ");
		int firstNumber = sc.nextInt();
		
		System.out.print("Introduceti un exponent: ");
		int secondNumber = sc.nextInt();
		
		int result;
		sc.close();
		
		for(int i = 0; i <= secondNumber; i++) {
			
			result = 1;
			
			switch(firstNumber * i) {
			 case 0:
				 result = 1;
				 break;
			 default:
				 for(int j = 0; j < i; j++) {
					 result *= firstNumber;	 
				 }
				 break;
			}
				
				
			System.out.print(result + " ");
			
		}
	}
		
		
}

